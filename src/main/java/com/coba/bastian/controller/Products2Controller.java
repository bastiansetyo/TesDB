//package com.coba.bastian.controller;
//
//import com.coba.bastian.dao.ProductsIpaDao;
//import com.coba.bastian.data.Products2Repository;
//import com.coba.bastian.service.ProductsIpaService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@Slf4j
//@RestController
//public class Products2Controller {
//
//    @Autowired
//    private Products2Repository products2Repository;
//
//    @Autowired
//    private ProductsIpaService productsIpaService;
//
//    @GetMapping("/menampilkanmenu")
//    public List<ProductsIpaDao> menu2 () {
//        return productsIpaService.TampilHidden();
//    }
//
//    @PostMapping("/perintahSave2")
//    public List<ProductsIpaDao> save(@RequestBody ProductsIpaDao simpan) {
//        return productsIpaService.SimpanHidden(simpan);
//    }
//
//    @PostMapping("/perintahDelete2")
//    public List<ProductsIpaDao> delete(@RequestBody String hapus) {
//        return productsIpaService.HapusHidden(hapus);
//    }
//
//    @PostMapping("/perintahCari2")
//    public ProductsIpaDao cari(@RequestBody String id) {
//        return productsIpaService.CariHidden(id);
//
//    }
//
//}
