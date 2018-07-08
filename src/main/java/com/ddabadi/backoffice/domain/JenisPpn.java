package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tb_jnsppn")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class JenisPpn implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjnsppn")
    private Integer id;

    @Size(min = 0, max = 50)
    @Column(name = "namajenisppn", columnDefinition = "NVARCHAR")
    private String name;

}
