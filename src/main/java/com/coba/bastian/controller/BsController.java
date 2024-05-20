package com.coba.bastian.controller;

import com.coba.bastian.dao.BastianDao;
import com.coba.bastian.repository.BsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class BsController {
    @Autowired
    private BsRepository bsRepository;
    @GetMapping("/tug2")
    public List<BastianDao> tug2() {return bsRepository.findAll();}

    @PostMapping("/perintahSimpan")
    public List<BastianDao> simpan(@RequestBody BastianDao simpan) {
        BastianDao dao = new BastianDao();
        dao.setId(1);
        bsRepository.save(simpan);
        return bsRepository.findAll();
    }

    @PostMapping("/perintahHapus")
    public List<BastianDao> hapus(@RequestBody Integer id) {
        bsRepository.deleteById(id);
        return bsRepository.findAll();
    }

}


