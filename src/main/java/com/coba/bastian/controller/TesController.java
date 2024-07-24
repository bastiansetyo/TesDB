//package com.coba.bastian.controller;
//
//import com.coba.bastian.dao.SepatuDao;
//import com.coba.bastian.dto.TestDto;
//import com.coba.bastian.repository.TestRepository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Slf4j
//@RestController
//public class TesController {
//
//    @GetMapping("/hehe/{palindrome}")
//    public String pali(@PathVariable String palindrome) {
//        return this.palindrome(palindrome);
//    }
//// stream untuk olah list belajar besok
//    @PostMapping("/palindrome")
//    public String palindrome(@RequestBody String inputPalindrome) {//metod
//        String ori, dibalik = "";
//        System.out.println("ketik Palindrom");
//        ori = inputPalindrome;
//        int panjang = ori.length();
//        for (int i = panjang - 1; i >= 0; i--)
//            dibalik = dibalik + ori.charAt(i);
//        if (ori.equals(dibalik))
//            return "palindrom!!";
//        else
//            return "tidak palindrom!!";
//    }
//
//    @PostMapping("/cekinput")
//    public String hitung(@RequestBody String input) {
//        int huruf = 0;
//        int bilangan = 0;
//        int karakterLainnya = 0;
//
//        // Menghitung jumlah karakter, bilangan, dan huruf
//        for (int i = 0; i < input.length(); i++) {
//            char karakter = input.charAt(i);
//            if (Character.isLetter(karakter)) {
//                huruf++;
//            } else if (Character.isDigit(karakter)) {
//                bilangan++;
//            } else {
//                karakterLainnya++;
//            }
//        }
//
//        // Menampilkan hasil
//        return "Jumlah karakter: " + input.length() + "\n" + "jumlah huruf: " + huruf + "\n" + "jumlah bilangan "
//                + bilangan + "\n" + "karakterlain: " + karakterLainnya;
//    }
//
//    @PostMapping("/cobain")
//    public String cobaan(@RequestBody int jawab) {
//
//        if (jawab % 2 == 0)
//            return "bilangan genap";
//        else
//            return "bilangan ganjil";
//    }
//
//    @PostMapping("/cobain1")
//    public String cobaan1(@RequestBody int i) {
//
//        while (i <= 5)
//            ++i;
//        return "hello world" + " " + i;
//    }
//
//    @GetMapping("/cobain2")
//    public List<String> cobaan2() {
//        int i = 0;
//        List<String> response = new ArrayList<>();
//
//        while (i <= 10) {
//            String hasil = "hello world" + " " + i;
//            ++i;
//            response.add(hasil);
//        }
//        return response;
//    }
//
//
//
//    @PostMapping("/tugas")
//    public List<String> tuugas(@RequestBody TestDto input) {
//        String ori;
//        StringBuilder dibalik = new StringBuilder();
//        ori = input.getInput();
//        int panjang = ori.length();
//        int huruf = 0;
//        int bilangan = 0;
//        int karakterLainnya = 0;
//        List<String> response = new ArrayList<>();
//        String palindrom;
//
//        if (input.getIsPalindrom()) {
//            for (int i = panjang - 1; i >= 0; i--) {
//                dibalik.append(ori.charAt(i));
//            }
//
//            if (ori.contentEquals(dibalik)) {
//                palindrom = ori + " palindrom!!";
//                response.add(palindrom);
//            } else {
//                palindrom = ori + " tidak palindrom!!";
//                response.add(palindrom);
//            }
//        }
//        for (int j = 0; j < panjang; j++) {
//            char karakter = input.getInput().charAt(j);
//            if (Character.isLetter(karakter)) {
//                huruf++;
//            } else if (Character.isDigit(karakter)) {
//                bilangan++;
//            } else {
//                karakterLainnya++;
//            }
//        }
//
//        response.add("Jumlah karakter: " + input.getInput().length() + "\n" + "jumlah huruf: " + huruf + "\n" + "jumlah bilangan "
//                + bilangan + "\n" + "karakterlain: " + karakterLainnya);
//
//        return response;
//    }
//
//    @PostMapping("/tugas1")
//    public String tugaas1(@RequestBody String jay) {
//        char targetChar = 'a';
//        int jumlah = 0; // Initialize count array index
//
//        for (int i = 0; i < jay.length(); i++) { // If any matches found
//            if (jay.charAt(i) == targetChar) {
//                jumlah++;
//            }
//        }
//        return ("hasilnya  " + targetChar + ": " + jumlah);
//    }
//    @Autowired
//    private TestRepository testRepository;
//
//    @GetMapping("/tug1")
//    public List<SepatuDao> tug() {
//        return testRepository.findAll();
//    }
//
//  /*  @GetMapping("/perul")
//    public List<String> peru() {
//        var comp = Math.random();
//        List<String> response = new ArrayList<>();
//        if (comp <= 0.33){
//            comp hsl = "batu";
//            response.add(hsl);
//
//        }else if (comp >= 0.34 && comp < 0.67){
//            comp hsl = "gunting";
//            response.add(hsl);
//
//        }else {
//            String hsl = "kertas";
//            response.add(hsl);
//        }
//        return response;
//    }
//*/
//
//}
//
