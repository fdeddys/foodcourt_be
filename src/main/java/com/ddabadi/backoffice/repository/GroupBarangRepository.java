package com.ddabadi.backoffice.repository;

import com.ddabadi.backoffice.domain.GroupBarang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupBarangRepository extends JpaRepository<GroupBarang, Integer> {
}
