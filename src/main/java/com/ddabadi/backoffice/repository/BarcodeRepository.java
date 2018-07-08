package com.ddabadi.backoffice.repository;

import com.ddabadi.backoffice.domain.Barcode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarcodeRepository extends JpaRepository<Barcode, Integer> {
}
