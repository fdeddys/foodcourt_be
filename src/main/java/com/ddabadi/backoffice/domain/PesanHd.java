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
import java.util.Date;

@Entity
@Table(name = "tb_pesan_hd")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PesanHd extends Audit implements Serializable{

    @Id
    @Column(name = "idpesanhdr")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idsupplier")
    private Supplier supplier;

    @NotNull
    @Size(max = 11, min = 0)
    @Column(name = "nopo", columnDefinition = "NVARCHAR")
    private String noPo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tglpesan")
    private Date tglPesan;

    @Column
    private Integer tempo;

    @Size(min = 0, max = 300)
    @Column(columnDefinition = "NVARCHAR")
    private String catatan;

    @Column(columnDefinition = "BIT default 0")
    private boolean approve;

}
