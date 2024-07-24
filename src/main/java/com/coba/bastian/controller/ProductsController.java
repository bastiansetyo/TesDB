package com.coba.bastian.controller;

import com.coba.bastian.dao.ProductsIpaDao;
import com.coba.bastian.dao.ProductsDao;
import com.coba.bastian.dto.ProductsDto;
import com.coba.bastian.data.Products2Repository;
import com.coba.bastian.repository.ProductsRepository;
//import com.coba.bastian.service.ProductsIpaService;
import com.coba.bastian.service.ProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping
public class ProductsController {

    @Autowired
    private ProductsRepository productsRepository;
    private Products2Repository products2Repository;
    @Autowired
    private ProductsService productsService;


    @GetMapping("/menampilkantabel2")
    public List<ProductsIpaDao> menuu() {return productsService.Tampil2();}
    @GetMapping("/menampilkanTabelMenu")
    public List<ProductsDto> menu () {
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
