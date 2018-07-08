package com.ddabadi.backoffice.domain.Auditrail;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.DateTimeException;
import java.util.Date;

@MappedSuperclass
@Data
public class Audit {

    @Column(name = "userupdate", columnDefinition = "NVARCHAR")
    @NotNull
    @Size(max = 100, min = 0)
    private String userUpdate;

    @Column(name = "lastupdate")
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

}
