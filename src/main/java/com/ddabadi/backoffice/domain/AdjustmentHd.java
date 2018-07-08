package com.ddabadi.backoffice.domain;

import com.ddabadi.backoffice.domain.Auditrail.Audit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "tb_adjustment_hd")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class AdjustmentHd extends Audit implements Serializable {

    @Id
    @Column(name = "idadjusmenthdr")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lokasiid")
    private Lokasi lokasi;

    @Size(min = 0, max = 11)
    @NotNull
    @Column(name = "noadjusment", columnDefinition="NVARCHAR" )
    private String noAdjustment;

    @Size(min = 0, max = 100)
    @Column(columnDefinition="NVARCHAR" )
    private String catatan;

    @Column(columnDefinition = "BIT default 0")
    private boolean approve;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date tanggal;

    @Column(columnDefinition = "BIT default 0")
    private boolean hapus;

    @NotNull
    @Column(columnDefinition = "float")
    private BigDecimal dcHrgRetur;

}
