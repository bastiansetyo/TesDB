package com.coba.bastian.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tblpembeli")
@AllArgsConstructor
@NoArgsConstructor
public class SepatuDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nama_pembeli")
    private String nama;
    @Column(name = "alamat_domisili")
    private String alamatDomisili;
    private String telp;
    @Column(name = "alamat_pengiriman")
    private String alamatPengirim;
}
