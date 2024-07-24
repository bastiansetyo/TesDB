package com.coba.bastian.data;

import com.coba.bastian.dao.ProductsIpaDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Products2Repository extends JpaRepository<ProductsIpaDao, String> {

}
