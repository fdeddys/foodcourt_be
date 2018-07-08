package com.ddabadi.backoffice.service.rest;

import com.ddabadi.backoffice.domain.GroupBarang;
import com.ddabadi.backoffice.service.impl.GroupBarangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/groupbarang")
public class GroupBarangRest {

    @Autowired
    private GroupBarangServiceImpl groupBarangService;

    @GetMapping
    List<GroupBarang> getAll(){
        return groupBarangService.findAll();
    }

    @GetMapping(value = "{id}")
    GroupBarang getById(@PathVariable Integer id){
        return groupBarangService.findById(id);
    }
}
