package com.devsuperior.dsmeta.services;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SaleService {
    //Service é responsável por implementar operações de buscar as vendas


    //quem acessa o banco de dados é o repository
    @Autowired
    private SaleRepository repository;

    public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {

        LocalDate min = LocalDate.parse(minDate);
        LocalDate max = LocalDate.parse(maxDate);

        return repository.findAll(min, max, pageable);

    }
}
