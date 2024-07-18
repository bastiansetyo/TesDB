package com.coba.bastian.repository;

import com.coba.bastian.dao.ProductsDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsDao,String> {

    @Query(value = "select p from ProductsDao p where p.id = ?1")
    List<ProductsDao> findSemua(String strings);

}
