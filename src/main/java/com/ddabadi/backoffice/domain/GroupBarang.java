package com.ddabadi.backoffice.domain;

import com.ddabadi.backoffice.enumer.StatusEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_group")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class GroupBarang implements Serializable{

    @Id
    @Column(name = "groupbarangid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @OneToMany(mappedBy = "groupBarang")
//    private List<Barang> barangs = new ArrayList<>();

    @Size(min = 2, max = 50)
    @NotNull
    @Column(name = "namagroup", columnDefinition="NVARCHAR" )
    private String nama;

    @Column(name = "hapus", columnDefinition="BIT")
    private Boolean deleted;

    @PrePersist
    void preInsert() {
        if (this.deleted == null)
            this.deleted = false;
    }

}
