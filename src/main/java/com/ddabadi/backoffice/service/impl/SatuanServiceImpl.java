package com.ddabadi.backoffice.service.impl;

import com.ddabadi.backoffice.domain.Satuan;
import com.ddabadi.backoffice.repository.SatuanRepository;
import com.ddabadi.backoffice.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SatuanServiceImpl implements CustomService<Satuan> {

    @Autowired
    private SatuanRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Satuan findById(Integer id) {
        Optional<Satuan> Satuan = repository.findById(id);

        if (Satuan.isPresent()){
            return Satuan.get();
        }else   {
            return new Satuan();
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Satuan> findAll() {
        List<Satuan> Satuans = repository.findAll();

        if (Satuans == null){
            return new ArrayList<>();
        }else   {
            return Satuans;
        }
    }
}
