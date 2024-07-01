package com.coba.bastian.service;

import com.coba.bastian.dao.ProductsDao;
import com.coba.bastian.repository.ProductsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<ProductsDao> TampilHidden() {
        return productsRepository.findAll();
    }

    public List<ProductsDao> SimpanHidden(ProductsDao simpan) {
        productsRepository.save(simpan);
        return productsRepository.findAll();
    }

    public List<ProductsDao> HapusHidden(String hapus) {
        productsRepository.deleteById(hapus);
        return productsRepository.findAll();
    }

    public ProductsDao CariHidden(String id) {
        ProductsDao response = new ProductsDao();
        Optional<ProductsDao> dao = productsRepository.findById(id);
        if(dao.isPresent()) {
            response = dao.get();
        }
        return response;
    }
}
