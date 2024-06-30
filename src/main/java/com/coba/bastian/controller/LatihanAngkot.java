package com.coba.bastian.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class LatihanAngkot {


    @GetMapping("/angkot")
    public List<String> angkoot() {
        int i = 1;
        List<String> response = new ArrayList<>();

        while (i <= 10) {
            String hasil = "angkot no. " + " " + i + " beroprasi dengan baik.";
            ++i;
            response.add(hasil);
        }
        return response;
    }

    @GetMapping("/angkot1")
    public List<String> angkoot1() {
        int noangkot = 1;
        int angkotberoprasi = 6;
        int jumlahangkot = 10;
        List<String> response = new ArrayList<>();

        while (noangkot <= angkotberoprasi) {
            String hasil = "angkot no. " + " " + noangkot + " beroprasi dengan baik.";
            ++noangkot;
            response.add(hasil);
        }
        for (noangkot = angkotberoprasi + 1; noangkot <= jumlahangkot; noangkot++) {
            String hasil = "angkot no. " + " " + noangkot + " tidak beroprasi.";
            response.add(hasil);
        }
        return response;
    }

    @GetMapping("/angkot2")
    public List<String> angkoot2() {

        int angkotberoprasi = 6;
        int jumlahangkot = 10;
        List<String> response = new ArrayList<>();

        for (int noangkot = 1; noangkot <= jumlahangkot; noangkot++) {

            if (noangkot <= angkotberoprasi && noangkot != 5) {
                String hasil = "angkot no. " + " " + noangkot + " beroprasi.";
                response.add(hasil);
            } else if (noangkot == 10 || noangkot == 8 || noangkot == 5) {
                String hasil = "angkot no. " + " " + noangkot + " lembur.";
                response.add(hasil);
            } else {
                String hasil = "angkot no. " + " " + noangkot + " tidak beroprasi.";
                response.add(hasil);
            }
        }

        return response;
    }

}
