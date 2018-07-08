package com.ddabadi.backoffice.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tb_user")
@Data
public class UserLogin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser")
    private Integer id;

    @Size(min = 2, max = 20)
    @Column(name = "vc_un", columnDefinition = "NVARCHAR")
    private String userName;

    @Size(min = 1, max = 50)
    @Column(name = "vc_nama", columnDefinition = "NVARCHAR")
    private String name;

    @Column(name = "bt_aktif", columnDefinition = "BIT")
    private boolean aktif;

    @Column(name = "vc_password", columnDefinition = "NVARCHAR")
    private String password;

    @Column(name = "vc_nik", columnDefinition = "NVARCHAR")
    private String nik;

} 