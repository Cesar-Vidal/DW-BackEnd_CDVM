package com.microservicios.store.service;

import java.util.List;

import com.microservicios.store.modelos.Store;

public interface StoreService {

    public List<Store> findAll();
    public Store findById(Long id, Integer cantidad);
    
}
