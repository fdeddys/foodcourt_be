package com.ddabadi.backoffice.service.impl;

import com.ddabadi.backoffice.domain.GroupBarang;
import com.ddabadi.backoffice.repository.GroupBarangRepository;
import com.ddabadi.backoffice.service.CustomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GroupBarangServiceImpl implements CustomService<GroupBarang> {

    @Autowired
    private GroupBarangRepository repository;

    @Override
    @Transactional(readOnly = true)
    public GroupBarang findById(Integer id) {
        Optional<GroupBarang> groupBarang = repository.findById(id);

        if (groupBarang.isPresent()){
            return groupBarang.get();
        }else   {
            return new GroupBarang();
        }
    }

    @Override
    @Transactional(readOnly = true)
    public List<GroupBarang> findAll() {
        List<GroupBarang> groupBarangs = repository.findAll();

        if (groupBarangs == null){
            return new ArrayList<>();
        }else   {
            return groupBarangs;
        }
    }


}
