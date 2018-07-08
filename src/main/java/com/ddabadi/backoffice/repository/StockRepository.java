package com.ddabadi.backoffice.repository;

import com.ddabadi.backoffice.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Integer> {
}
