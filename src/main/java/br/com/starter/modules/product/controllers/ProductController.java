package br.com.starter.modules.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.starter.modules.product.model.Product;
import br.com.starter.modules.product.services.ListProductsService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ListProductsService listProductsService;

    @GetMapping
    public List<Product> list() {
        return listProductsService.listAll();
    }

}
