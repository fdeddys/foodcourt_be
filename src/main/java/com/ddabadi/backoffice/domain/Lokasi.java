package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_lokasi")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Lokasi {

    @Id
    @Column(name = "lokasiid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "namalokasi", columnDefinition="NVARCHAR" )
    private String nama;

    @Size(min = 1, max = 30)
    @NotNull
    @Column(name = "namastore", columnDefinition="NVARCHAR" )
    private String namaStore;

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "alamat1", columnDefinition="NVARCHAR" )
    private String alamat1;

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "alamat2", columnDefinition="NVARCHAR" )
    private String alamat2;

    @Column(name = "hapus", columnDefinition="BIT")
    private Boolean deleted;

    @PrePersist
    void preInsert() {
        if (this.deleted == null)
            this.deleted = false;
    }
}
