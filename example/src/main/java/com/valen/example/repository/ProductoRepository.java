package com.valen.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.valen.example.entity.Product;

public interface ProductoRepository extends JpaRepository<Product,Long>{ }
