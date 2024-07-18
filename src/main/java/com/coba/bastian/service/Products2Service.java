package com.coba.bastian.service;

import com.coba.bastian.dao.Products2Dao;
import com.coba.bastian.dao.ProductsDao;
import com.coba.bastian.dto.ProductsDto;

import java.util.List;

public interface Products2Service {

    List<Products2Dao> TampilHidden();

    List<Products2Dao> SimpanHidden(Products2Dao simpan);

    List<Products2Dao> HapusHidden(String hapus);

    Products2Dao CariHidden(String id);
}
