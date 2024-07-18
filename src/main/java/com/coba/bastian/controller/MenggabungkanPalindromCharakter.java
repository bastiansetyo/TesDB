package com.coba.bastian.controller;

import com.coba.bastian.dto.TestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

public class MenggabungkanPalindromCharakter {
    @PostMapping("/tugas")
    public List<String> tuugas(@RequestBody TestDto input) {
        String ori;
        StringBuilder dibalik = new StringBuilder();
        ori = input.getInput();
        int panjang = ori.length();
        int huruf = 0;
        int bilangan = 0;
        int karakterLainnya = 0;
        List<String> response = new ArrayList<>();
        String palindrom;

        if (input.getIsPalindrom()) {
            for (int i = panjang - 1; i >= 0; i--) {
                dibalik.append(ori.charAt(i));
            }

            if (ori.contentEquals(dibalik)) {
                palindrom = ori + " palindrom!!";
                response.add(palindrom);
            } else {
                palindrom = ori + " tidak palindrom!!";
                response.add(palindrom);
            }
        }
        for (int j = 0; j < panjang; j++) {
            char karakter = input.getInput().charAt(j);
            if (Character.isLetter(karakter)) {
                huruf++;
            } else if (Character.isDigit(karakter)) {
                bilangan++;
            } else {
                karakterLainnya++;
            }
        }

        response.add("Jumlah karakter: " + input.getInput().length() + "\n" + "jumlah huruf: " + huruf + "\n" + "jumlah bilangan "
                + bilangan + "\n" + "karakterlain: " + karakterLainnya);

        return response;
    }
}
