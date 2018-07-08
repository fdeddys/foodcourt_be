package com.ddabadi.backoffice.service.rest;

import com.ddabadi.backoffice.domain.Satuan;
import com.ddabadi.backoffice.service.impl.SatuanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/satuan")
public class SatuanRest {

    @Autowired
    private SatuanServiceImpl satuanService;

    @GetMapping
    List<Satuan> getAll(){
        return satuanService.findAll();
    }

    @GetMapping(value = "{id}")
    Satuan getById(@PathVariable Integer id){
        return satuanService.findById(id);
    }


}
