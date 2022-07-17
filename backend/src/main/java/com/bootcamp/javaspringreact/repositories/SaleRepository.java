package com.bootcamp.javaspringreact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bootcamp.javaspringreact.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
