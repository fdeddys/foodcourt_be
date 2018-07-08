package com.ddabadi.backoffice.repository;

import com.ddabadi.backoffice.domain.Satuan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SatuanRepository extends JpaRepository<Satuan, Integer> {
}
