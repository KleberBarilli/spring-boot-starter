package br.com.starter.modules.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.starter.modules.product.repository.ProductRepository;
import br.com.starter.modules.product.model.Product;

@Service
public class ListProductsService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }
}
