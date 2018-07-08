package com.ddabadi.backoffice.service.impl;

import com.ddabadi.backoffice.domain.Barang;
import com.ddabadi.backoffice.repository.BarangRepository;
import com.ddabadi.backoffice.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarangServiceImpl implements CustomService<Barang> {

    @Autowired
    private BarangRepository repository;

    @Override
    public Barang findById(Integer id) {
        return repository.getOne(id);
    }

    @Override
    public List<Barang> findAll() {
        return repository.findAll();
    }
}
