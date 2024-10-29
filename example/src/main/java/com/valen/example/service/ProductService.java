package com.valen.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.valen.example.entity.Product;
import com.valen.example.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductoRepository productoRepository;


    public List<Product> findAll() {
        return productoRepository.findAll();
    }

    public Optional<Product> findById(Long id) {
        return productoRepository.findById(id);
    }


    public Double calcularTotal(List<Product> productos) {
        double total = 0;
        for (Product producto : productos) {
            total += producto.getPrice() * producto.getCantidad();
        }
        return total;
    }
}
