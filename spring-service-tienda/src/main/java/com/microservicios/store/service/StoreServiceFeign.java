package com.microservicios.store.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.microservicios.store.client.CelularClientFeign;
import com.microservicios.store.modelos.Store;

@Service("serviceFeign")
@Primary
public class StoreServiceFeign implements StoreService{

    @Autowired
    private CelularClientFeign clientFeign;

    @Override
    public List<Store> findAll() {
        return clientFeign.list().stream().map(c -> new Store(c, 5)).collect(Collectors.toList());
    }
    
    @Override
    public Store findById(Long id, Integer cantidad) {
        return new Store(clientFeign.detail(id), cantidad);
    }

        
}
