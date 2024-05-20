package com.coba.bastian.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "bstabel")
@AllArgsConstructor
@NoArgsConstructor
public class BastianDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String kota;
    private String toko;
    private String telp;


}
