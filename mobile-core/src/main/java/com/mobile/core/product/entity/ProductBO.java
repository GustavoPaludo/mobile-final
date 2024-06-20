package com.mobile.core.product.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

@Service
public interface ProductBO extends JpaRepository<Product, Long> {

	public List<Product> findAll();

	@Query("SELECT p FROM Product p WHERE p.id IN :ids")
    List<Product> findByIdList(@Param("ids") List<Long> ids);}
