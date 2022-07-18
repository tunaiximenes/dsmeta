package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {
    //Service é responsável por implementar operações de buscar as vendas


    //quem acessa o banco de dados é o repository
    @Autowired
    private SaleRepository repository;

    public List<Sale> findSales() {
        return repository.findAll();

    }
}
