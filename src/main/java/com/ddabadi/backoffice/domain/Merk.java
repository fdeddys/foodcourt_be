package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_merk")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Merk {

    @Id
    @Column(name = "merkid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @OneToMany(mappedBy = "merk" )
//    List<Barang> barangs = new ArrayList<>();

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "namamerk", columnDefinition="NVARCHAR" )
    private String nama;

    @Column(name = "hapus", columnDefinition="BIT")
    private Boolean deleted;

    @PrePersist
    void preInsert() {
        if (this.deleted == null)
            this.deleted = false;
    }

}
