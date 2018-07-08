package com.ddabadi.backoffice.domain;

import com.ddabadi.backoffice.domain.Auditrail.Audit;
import com.ddabadi.backoffice.enumer.JenisResto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "tb_barang")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Barang extends Audit implements Serializable {
    @Id
    @Column(name = "barangid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "groupbarangid")
    private GroupBarang groupBarang;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "merkid")
    private Merk merk;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "satuanbesar_idsatuan")
    private Satuan satuanBesar;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "satuankecil_idsatuan")
    private Satuan satuanKecil;

    @Size(min = 2, max = 100)
    @NotNull
    @Column(name = "namabarang", columnDefinition="NVARCHAR" )
    private String nama;

    @NotNull
    @Column(name = "isstock", columnDefinition="BIT default true" )
    private boolean stock;

    @NotNull
    @Column(name = "hargajual", columnDefinition="FLOAT default 0")
    private BigDecimal hargajual;

    @NotNull
    @Column(name = "nilaibarang", columnDefinition="FLOAT default 0" )
    private BigDecimal nilaiBarang;

    @NotNull
    @Column(name = "minstock", columnDefinition="default 0" )
    private Integer minStock;

    @NotNull
    @Column(name = "jenismasterresto", columnDefinition="default 0" )
    private JenisResto jenisResto;

    @NotNull
    @Column(name = "konversisatuan", columnDefinition="default 0" )
    private int qtyConvertion;

    @Size(min = 0, max = 7)
    @NotNull
    @Column(name= "kodebarang", columnDefinition="NVARCHAR" )
    private String kode;

    @NotNull
    @Column(name = "hargabeli", columnDefinition="FLOAT default 0" )
    private BigDecimal hargaBeli;

    @NotNull
    @Column(name = "stockakhir" )
    private int stockakhir;

    @NotNull
    @Column(name = "hargadasar", columnDefinition="FLOAT default 0" )
    private BigDecimal hargaDasar;

    @Column(name = "hapus", columnDefinition="BIT")
    private Boolean deleted;

    @PrePersist
    void preInsert() {
        if (this.deleted == null) this.deleted = false;
        if (this.jenisResto == null) this.jenisResto =JenisResto.NONRESTO;
    }

}
