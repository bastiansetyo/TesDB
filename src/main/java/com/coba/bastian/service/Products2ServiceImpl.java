package com.coba.bastian.service;

import com.coba.bastian.dao.Products2Dao;
import com.coba.bastian.data.Products2Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Service
@RestController
public class Products2ServiceImpl implements Products2Service {

    @Autowired
    private Products2Repository products2Repository;

    @Override
    public List<Products2Dao> TampilHidden() {
        return products2Repository.findAll();
    }
    public List<Products2Dao> SimpanHidden (Products2Dao simpan) {
        products2Repository.save(simpan);
        return products2Repository.findAll();
    }

    public List<Products2Dao> HapusHidden(String hapus) {
        products2Repository.deleteById(hapus);
        return products2Repository.findAll();
    }

    public Products2Dao CariHidden(String id) {
        Products2Dao response = new Products2Dao();
        List<Products2Dao> dao = products2Repository.findAll();
        if(!dao.isEmpty()) {
            response = dao.get(0);
        }
        return response;
    }


}
