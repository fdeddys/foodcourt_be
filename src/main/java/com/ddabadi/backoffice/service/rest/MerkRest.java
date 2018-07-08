package com.ddabadi.backoffice.service.rest;

import com.ddabadi.backoffice.domain.Merk;
import com.ddabadi.backoffice.service.impl.MerkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "api/merk")
public class MerkRest {
    
    @Autowired
    private MerkServiceImpl merkService;

    @GetMapping
    List<Merk> getAll(){
        return merkService.findAll();
    }

    @GetMapping(value = "{id}")
    Merk getById(@PathVariable Integer id){
        return merkService.findById(id);
    }
}
