package com.coba.bastian.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ProductsDto {

    private Integer id;
    private Integer portfolio_id;
    private Integer asset_class;
    private String accounting_type;
    private String gain_loss_type;
    private String unrealized;
    private String dividend;
    private String accrual_inv;
    private String fee_inv;
    private String gross_nett;
    private String amortization;
    private String method;
    private String total_accrual;
    private String period;
    private String asset_recognition;
    //    @Column(name = "create_by")
//    private Integer createBy;
//    private Date createDate;
//    private Integer updateBy;
//    private Date updateDate;
    private String description;
    private Date active_date;
    private Integer companyid;

}
