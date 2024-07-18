package com.coba.bastian.service;

import com.coba.bastian.dao.Products2Dao;
import com.coba.bastian.dao.ProductsDao;
import com.coba.bastian.dto.ProductsDto;

import java.util.List;

public interface ProductsService {

    List<Products2Dao> Tampil2();
    List<ProductsDto> TampilHidden();

    List<ProductsDao> SimpanHidden(ProductsDao simpan);

    List<ProductsDao> HapusHidden(String hapus);

    ProductsDao CariHidden(String id);
}
