package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Stock {

    @Id
    @Column(name = "idstock")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "lokasiid")
    private Lokasi lokasi;

    @ManyToOne
    @JoinColumn(name = "barangid")
    private Barang barang;

    @Column
    private Integer jumlah;


}
