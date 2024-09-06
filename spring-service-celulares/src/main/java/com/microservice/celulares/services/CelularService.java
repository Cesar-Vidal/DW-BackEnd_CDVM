package com.microservice.celulares.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservice.celulares.entity.Celular;

@Service
public interface CelularService { 
	
    public List<Celular> findAll();
    
    public Celular save(Celular instance);
    
    public void deleteById(long id);
    
    public Celular findById(long id);
    
    public boolean existsById(long id);
    
}
