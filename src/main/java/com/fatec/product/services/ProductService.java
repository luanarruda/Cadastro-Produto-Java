package com.fatec.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.product.entities.Product;
import com.fatec.product.repositories.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Produto não cadastrado"));
    }

    public void deleteProductById(int id) {
        if (this.productRepository.existsById(id)) {
            this.productRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Produto não cadastrado");
        }
    }

    public Product save(Product product) {
        return this.productRepository.save(product);
    }

    public void update(int id, Product product) {
        try {
            Product aux = productRepository.getReferenceById(id);
            aux.setName(product.getName());
            aux.setPrice(product.getPrice());
            aux.setQnt(product.getQnt());
            this.productRepository.save(aux);
        } catch (EntityNotFoundException e) {
            throw new EntityNotFoundException("Produto não cadastrado");
        }
    }

}
