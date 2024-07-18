package com.coba.bastian.controller;

import com.coba.bastian.dao.Products2Dao;
import com.coba.bastian.data.Products2Repository;
import com.coba.bastian.service.Products2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class Products2Controller {

    @Autowired
    private Products2Repository products2Repository;

    @Autowired
    private Products2Service products2Service;

    @GetMapping("/menampilkanmenu")
    public List<Products2Dao> menu2 () {
        return products2Service.TampilHidden();
    }

    @PostMapping("/perintahSave2")
    public List<Products2Dao> save(@RequestBody Products2Dao simpan) {
        return products2Service.SimpanHidden(simpan);
    }

    @PostMapping("/perintahDelete2")
    public List<Products2Dao> delete(@RequestBody String hapus) {
        return products2Service.HapusHidden(hapus);
    }

    @PostMapping("/perintahCari2")
    public Products2Dao cari(@RequestBody String id) {
        return products2Service.CariHidden(id);

    }

}
