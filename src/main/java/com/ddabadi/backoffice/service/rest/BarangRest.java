package com.ddabadi.backoffice.service.rest;

import com.ddabadi.backoffice.domain.Barang;
import com.ddabadi.backoffice.service.impl.BarangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/barang")
public class BarangRest {

    @Autowired
    private BarangServiceImpl barangService;

    @GetMapping
    List<Barang> getAll(){
        return barangService.findAll();
    }

    @GetMapping(value = "{id}")
    Barang getById(@PathVariable Integer id){
        return barangService.findById(id);
    }
}
