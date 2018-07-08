package com.ddabadi.backoffice.service.impl;

import com.ddabadi.backoffice.domain.Merk;
import com.ddabadi.backoffice.repository.MerkRepository;
import com.ddabadi.backoffice.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MerkServiceImpl implements CustomService<Merk> {


    @Autowired
    private MerkRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Merk findById(Integer id) {
        Optional<Merk> Merk = repository.findById(id);

        if (Merk.isPresent()){
            return Merk.get();
        }else   {
            return new Merk();
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<Merk> findAll() {
        List<Merk> Merks = repository.findAll();

        if (Merks == null){
            return new ArrayList<>();
        }else   {
            return Merks;
        }
    }
    
}
