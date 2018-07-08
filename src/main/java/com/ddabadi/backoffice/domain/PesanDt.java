package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_pesan_dtl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PesanDt implements Serializable {

    @Id
    @Column(name = "idpesandtl")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idpesanhdr")
    private PesanHd pesanHd;

    @ManyToOne
    @JoinColumn(name = "barangid")
    private Barang barang;

    @Column(columnDefinition = "default 0")
    private Double jumlah;

    @Column(name = "isterima", columnDefinition = "BIT default 0")
    private boolean terima;

    @ManyToOne
    @JoinColumn(name = "satuan_idsatuan")
    private Satuan satuan;

}
