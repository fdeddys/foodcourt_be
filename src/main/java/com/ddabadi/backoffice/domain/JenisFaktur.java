package com.ddabadi.backoffice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "tb_jnsfaktur")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class JenisFaktur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idjnsfaktur")
    private Integer id;

    @Size(min = 0, max = 50)
    @Column(name = "namajenisfaktur", columnDefinition = "NVARCHAR")
    private String name;

}
