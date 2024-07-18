package com.coba.bastian.dao;


import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data //@Data adalah anotasi pintasan praktis yang menggabungkan fitur @ToString , @EqualsAndHashCode , @Getter / @Setter dan @RequiredArgsConstructor bersama-sama
@Entity
@Table(name = "roi_custom_settings")
@AllArgsConstructor
@NoArgsConstructor
public class ProductsDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer portfolio_id;
    private Integer asset_class;
    private String accounting_type;
    private Integer gain_loss_type;
    private Integer unrealized;
    private Integer dividend;
    private Integer accrual_inv = 0;
    private Integer fee_inv;
    private Integer gross_nett;
    private Integer amortization;
    private Integer method;
    private Integer total_accrual = 0;
    private Integer period;
    private Integer asset_recognition;
//    @Column(name = "create_by")
 //   private Integer createBy;
//    private Date createDate;
//    private Integer updateBy;
//    private Date updateDate;
    private String description;
    private Date active_date;
    private Integer companyid;

}