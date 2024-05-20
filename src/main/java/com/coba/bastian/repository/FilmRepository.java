package com.coba.bastian.repository;

import com.coba.bastian.dao.FilmDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<FilmDao, Integer> {

}
