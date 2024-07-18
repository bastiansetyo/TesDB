package com.coba.bastian.dao;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Table(name = "amortizationplan")
@AllArgsConstructor
@NoArgsConstructor
public class Products2Dao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer companyid;
    private Integer prortfolioid;
    private Integer assettype;
    private String productid;
    private String transactionid;
    private Date amortdate;
    private Integer buynominal;
    private Integer amortizenominal;
    private Integer realizenominal;
    private Integer buynominalgross;
    private Integer accountingtype;
    private Integer amortizeprice;
    private Integer effectivelnterest;
    private Integer nominallnterest;
}
