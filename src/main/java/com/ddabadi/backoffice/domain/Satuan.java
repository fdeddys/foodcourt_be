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
@Table(name = "tb_satuan")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Satuan {

    @Id
    @Column(name = "idsatuan")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "namasatuan", columnDefinition="NVARCHAR" )
    private String nama;

//    @OneToMany(mappedBy = "satuanBesar")
//    private List<Barang> barangs = new ArrayList<>();
//
//    @OneToMany(mappedBy = "satuanKecil")
//    private List<Barang> barangList = new ArrayList<>();

    @Column(name = "hapus", columnDefinition="BIT")
    private Boolean deleted;

    @PrePersist
    void preInsert() {
        if (this.deleted == null)
            this.deleted = false;
    }
}
