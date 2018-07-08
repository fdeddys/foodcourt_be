package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tb_barcode")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Barcode implements Serializable {

    @Id
    @Column(name = "barcodeid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "barangid")
    private Barang barang;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "barcodeisi",columnDefinition = "NVARCHAR")
    private String isi;

}
