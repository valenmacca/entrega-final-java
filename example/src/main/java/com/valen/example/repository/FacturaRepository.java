package com.valen.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.valen.example.entity.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}