package com.coba.bastian.controller;

import com.coba.bastian.dao.ProductsDao;
import com.coba.bastian.repository.ProductsRepository;
import com.coba.bastian.service.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private ProductsService productsService;

    @GetMapping("/menampilkanTabelMenu")
    public List<ProductsDao> menu() {
        return productsService.TampilHidden();
    }

    @PostMapping("/perintahSave")
    public List<ProductsDao> save(@RequestBody ProductsDao simpan) {
        return productsService.SimpanHidden(simpan);
    }

    @PostMapping("/perintahDelete")
    public List<ProductsDao> delete(@RequestBody String hapus) {
        return productsService.HapusHidden(hapus);
    }

    @PostMapping("/perintahCari")
    public ProductsDao cari(@RequestBody String id) {
        return productsService.CariHidden(id);

    }
}
