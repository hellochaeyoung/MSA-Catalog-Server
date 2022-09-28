package com.msa.example.catalogservice.service;

import com.msa.example.catalogservice.jpa.CatalogEntity;
import com.msa.example.catalogservice.jpa.CatalogRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Data
@Service
@Slf4j
@AllArgsConstructor
public class CatalogServiceImpl implements CatalogService  {

    private final CatalogRepository catalogRepository;

    @Override
    public Iterable<CatalogEntity> getAllCatalogs() {
        return catalogRepository.findAll();
    }
}
