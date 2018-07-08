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
@Table(name = "tb_terima_hd")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TerimaHd extends Audit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idterimahdr")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idsupplier")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "jenisfakturid")
    private JenisFaktur jenisFaktur;

    @ManyToOne
    @JoinColumn(name = "jenisppnid")
    private JenisPpn jenisPpn;

    @NotNull
    @Size(min = 0, max = 11)
    @Column(name = "noterima", columnDefinition = "NVARCHAR")
    private String noTerima;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tglterima")
    private Date tglTerima;

    @Column
    private Integer tempo;

    @Size(min = 0, max = 300)
    @Column(columnDefinition = "NVARCHAR")
    private String catatan;

    @Size(min = 0, max = 300)
    @Column(name = "nofaktur", columnDefinition = "NVARCHAR")
    private String noFaktur;

    @NotNull
    @Column(columnDefinition = "float")
    private BigDecimal total;

    @Column(name = "isppn", columnDefinition = "BIT default 0")
    private boolean ppn;

    @Column(name = "discglobal", columnDefinition = "float")
    private BigDecimal discGlobal;

    @NotNull
    @Column(name = "approve", columnDefinition = "BIT default 0")
    private boolean approve;

    @NotNull
    @Column(name = "istarikpembayaran", columnDefinition = "BIT default 0")
    private boolean paid;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tgltempo")
    private Date tglTempo;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tglfaktur")
    private Date tglFaktur;

    @NotNull
    @Column(name = "disctotal", columnDefinition = "float")
    private BigDecimal discTotal;

    @NotNull
    @Column(name = "ppntotal", columnDefinition = "float")
    private BigDecimal ppnTotal;

    @NotNull
    @Column(name = "biayalain", columnDefinition = "float")
    private BigDecimal biayaLain;

    @NotNull
    @Column(name = "grandtotal", columnDefinition = "float")
    private BigDecimal grandTotal;

    @NotNull
    @Column(columnDefinition = "BIT default 0")
    private boolean hapus;


}
