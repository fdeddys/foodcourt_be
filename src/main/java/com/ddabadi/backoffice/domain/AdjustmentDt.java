package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tb_adjustment_dtl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AdjustmentDt implements Serializable {

    @Id
    @Column(name = "idadjusmentdtl")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "adjustmenthdr_idadjusmenthdr")
    private AdjustmentHd adjustmentHd;

    @ManyToOne
    @JoinColumn(name = "barangid")
    private Barang barang;

    @Column(columnDefinition = "default 0")
    private Double qty;

    @Column(name = "nilaibarang")
    private Double nilaiBarang;


}
