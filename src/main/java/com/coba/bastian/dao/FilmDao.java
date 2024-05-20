package com.coba.bastian.dao;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "film")
@AllArgsConstructor
@NoArgsConstructor
public class FilmDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nama_film;
    private Integer bangku;

}
