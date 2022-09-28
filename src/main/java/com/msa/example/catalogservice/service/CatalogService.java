package com.msa.example.catalogservice.service;

import com.msa.example.catalogservice.jpa.CatalogEntity;

public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();

}
