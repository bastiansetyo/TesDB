package com.coba.bastian.service;

import com.coba.bastian.dao.ProductsDao;
import com.coba.bastian.dao.ProductsIpaDao;
import com.coba.bastian.dto.ProductsDto;
import com.coba.bastian.dto.ProductsIpaDto;

import java.util.List;

public interface ProductsService {

    //List<ProductsIpaDao> Tampil2();
    List<ProductsDto> TampilHidden();

    List<ProductsDao> SimpanHidden(ProductsDao simpan);

    List<ProductsDao> HapusHidden(String hapus);

    ProductsDao CariHidden(String id);

    List<ProductsIpaDao> Tampil2();


}
