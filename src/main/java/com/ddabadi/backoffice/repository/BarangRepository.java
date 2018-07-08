package com.ddabadi.backoffice.repository;

import com.ddabadi.backoffice.domain.Barang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarangRepository extends JpaRepository<Barang, Integer> {
}
