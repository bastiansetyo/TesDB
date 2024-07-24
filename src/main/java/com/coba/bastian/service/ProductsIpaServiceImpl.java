//package com.coba.bastian.service;
//
//import com.coba.bastian.dao.ProductsIpaDao;
//import com.coba.bastian.dto.ProductsIpaDto;
//import com.coba.bastian.data.Products2Repository;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@Slf4j
//@Service
//@RestController
//public class ProductsIpaServiceImpl implements ProductsIpaService {
//
//    @Autowired
//    private Products2Repository products2Repository;
//
//    @Override
//    public List<ProductsIpaDao> TampilHidden() {
//        return products2Repository.findAll();
//    }
//    public List<ProductsIpaDao> SimpanHidden (ProductsIpaDao simpan) {
//        products2Repository.save(simpan);
//        return products2Repository.findAll();
//    }
//
//    public List<ProductsIpaDao> HapusHidden(String hapus) {
//        products2Repository.deleteById(hapus);
//        return products2Repository.findAll();
//    }
//
//    public ProductsIpaDao CariHidden(String id) {
//        ProductsIpaDao response = new ProductsIpaDao();
//        List<ProductsIpaDao> dao = products2Repository.findAll();
//        if(!dao.isEmpty()) {
//            response = dao.get(0);
//        }
//        return response;
//    }
//
//
//}
