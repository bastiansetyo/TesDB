package com.coba.bastian.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TesController {

    @GetMapping("/hehe/{palindrome}")
    public String pali(@PathVariable String palindrome){
        return this.palindrome(palindrome);
    }

    @PostMapping("/palindrome")
    public String palindrome(@RequestBody String inputPalindrome){
        String ori, dibalik = "";
        System.out.println("ketik Palindrom");
        ori = inputPalindrome;
        int panjang = ori.length();
        for (int i = panjang - 1; i >=0; i--)
            dibalik = dibalik + ori.charAt(i);
        if (ori.equals(dibalik))
            return"palindrom!!";
        else
            return "tidak palindrom!!";
    }
}
