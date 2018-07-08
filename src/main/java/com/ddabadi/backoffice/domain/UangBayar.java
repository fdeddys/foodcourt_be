package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigInteger;

@Entity
@Table(name = "tb_uangbayar")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UangBayar {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 1, max = 20)
    @NotNull
    @Column(name = "namabutton1", columnDefinition="NVARCHAR" )
    private String nama1;

    @NotNull
    @Column(name = "nilaibutton1", columnDefinition = "BIGINT")
    private BigInteger nilai1;

    @Size(min = 1, max = 20)
    @NotNull
    @Column(name = "namabutton2", columnDefinition="NVARCHAR" )
    private String nama2;

    @NotNull
    @Column(name = "nilaibutton2", columnDefinition = "BIGINT")
    private BigInteger nilai2;

    @Size(min = 1, max = 20)
    @NotNull
    @Column(name = "namabutton3", columnDefinition="NVARCHAR" )
    private String nama3;

    @NotNull
    @Column(name = "nilaibutton3", columnDefinition = "BIGINT")
    private BigInteger nilai3;

    @Size(min = 1, max = 20)
    @NotNull
    @Column(name = "namabutton4", columnDefinition="NVARCHAR" )
    private String nama4;

    @NotNull
    @Column(name = "nilaibutton4", columnDefinition = "BIGINT")
    private BigInteger nilai4;

    @Size(min = 1, max = 20)
    @NotNull
    @Column(name = "namabutton5", columnDefinition="NVARCHAR" )
    private String nama5;

    @NotNull
    @Column(name = "nilaibutton5", columnDefinition = "BIGINT")
    private BigInteger nilai5;

    @Size(min = 1, max = 20)
    @NotNull
    @Column(name = "namabutton6", columnDefinition="NVARCHAR" )
    private String nama6;

    @NotNull
    @Column(name = "nilaibutton6", columnDefinition = "BIGINT")
    private BigInteger nilai6;

}
