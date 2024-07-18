package com.coba.bastian.service;

import com.coba.bastian.dao.Products2Dao;
import com.coba.bastian.dao.ProductsDao;
import com.coba.bastian.dto.ProductsDto;
import com.coba.bastian.data.Products2Repository;
import com.coba.bastian.repository.ProductsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Slf4j
@Service
@RestController
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsRepository productsRepository;
    private Products2Repository products2Repository;
    @Override
    public List<Products2Dao> Tampil2(){
        return products2Repository.findAll();
    }
    public List<ProductsDto> TampilHidden() {
        List<String> pilihan = Arrays.asList("tidak", "ya", "tidak tau");
        List<ProductsDto> result = new ArrayList<>();
           List<ProductsDao> productsDaos = productsRepository.findAll();
           for (ProductsDao dao : productsDaos) {
               ProductsDto dto = new ProductsDto();
               BeanUtils.copyProperties(dao, dto);
               int hasil;
               if (dao.getUnrealized() != 0) {
                   hasil = 0 / dao.getUnrealized();
               } else {

                   hasil = Integer.MAX_VALUE;
               }

               dto.setAccrual_inv(pilihan.get(Objects.isNull(dao.getAccrual_inv())? 0 :dao.getAccrual_inv()));
               dto.setGain_loss_type(pilihan.get(dao.getGain_loss_type()));
               dto.setUnrealized(pilihan.get(dao.getUnrealized()));
               dto.setDividend(pilihan.get(dao.getDividend()));
               dto.setFee_inv(pilihan.get(dao.getFee_inv()));
               dto.setGross_nett(pilihan.get(dao.getGross_nett()));
               dto.setAmortization(pilihan.get(dao.getAmortization()));
               dto.setMethod(pilihan.get(dao.getMethod()));
               dto.setTotal_accrual(pilihan.get(Objects.isNull(dao.getTotal_accrual()) ? 0 : dao.getTotal_accrual()));
               dto.setPeriod(pilihan.get(dao.getPeriod()));
               dto.setAsset_recognition(pilihan.get(dao.getAsset_recognition()));
               result.add(dto);
           }
           return result;

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
        List<ProductsDao> dao = productsRepository.findSemua(id);
        if(!dao.isEmpty()) {
            response = dao.get(0);
        }
        return response;
    }
}
