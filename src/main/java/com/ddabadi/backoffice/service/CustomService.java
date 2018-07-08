package com.ddabadi.backoffice.service;

import java.util.List;

public interface CustomService<T> {

    T findById(Integer id);
    List<T> findAll();

}
