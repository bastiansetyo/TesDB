package com.coba.bastian.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController

public class Palindrome {

    @PostMapping("/palindrom")
    public String palindrom(@RequestBody String inputan){
        String cekpali = "";
        int input;
        System.out.print("masukan teks yang di cek : ");
        input = inputan.length();
        for (int i = input - 1; i >= 0; i--)
            cekpali = cekpali + inputan.charAt(i);
        if (inputan.equals(cekpali))
            return "palindrom";
        else
            return "tidak palindrom";
    }

   /* public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukan teks yang di cek : ");
        String inputan = scanner.nextLine();
        String cekpali = "";
        int input;

        input = inputan.length();
        for (int i = input - 1; i >= 0; i--)
            cekpali = cekpali + inputan.charAt(i);
        if (inputan.equals(cekpali))
            System.out.print("palindrom");
        else
            System.out.print("tidak palindrom");
    }*/

}
