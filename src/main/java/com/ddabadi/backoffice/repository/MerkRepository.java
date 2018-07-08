package com.ddabadi.backoffice.repository;

import com.ddabadi.backoffice.domain.Merk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerkRepository extends JpaRepository<Merk, Integer> {
}
