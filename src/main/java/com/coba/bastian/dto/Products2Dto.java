package com.coba.bastian.dto;

import lombok.Data;

import java.util.Date;
@Data
public class Products2Dto {
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
