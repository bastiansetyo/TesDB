package com.coba.bastian.service;

import com.coba.bastian.dao.ProductsDao;

import java.util.List;

public interface ProductsService {

    List<ProductsDao> TampilHidden();

    List<ProductsDao> SimpanHidden(ProductsDao simpan);

    List<ProductsDao> HapusHidden(String hapus);

    ProductsDao CariHidden(String id);
}
