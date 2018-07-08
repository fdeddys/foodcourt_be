package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "tb_supplier")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Supplier {

    @Id
    @Column(name = "idsupplier")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 2, max = 100)
    @NotNull
    @Column(name = "namasupplier", columnDefinition="NVARCHAR" )
    private String nama;

    @Size(min = 1, max = 300)
    @NotNull
    @Column(name = "alamat", columnDefinition="NVARCHAR" )
    private String alamat;

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "kota", columnDefinition="NVARCHAR" )
    private String kota;

    @Size(min = 2, max = 30)
    @NotNull
    @Column(name = "telp", columnDefinition="NVARCHAR" )
    private String telp;

    @Size(min = 2, max = 30)
    @NotNull
    @Column(name = "fax", columnDefinition="NVARCHAR" )
    private String fax;

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "cperson", columnDefinition="NVARCHAR" )
    private String contactPerson;

    @Size(min = 2)
    @NotNull
    @Column(name = "userupdate", columnDefinition="NVARCHAR" )
    private String userUpdate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "lastupdate" )
    private Date lastUpdate;

    @Column(name = "hapus", columnDefinition="BIT")
    private Boolean deleted;

    @PrePersist
    void preInsert() {
        if (this.deleted == null)
            this.deleted = false;
    }
}
