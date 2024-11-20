package com.example.springboot.controllers;

import com.example.springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //Ponto de injeção para acesso aos métodos JPA de ProductRepository
    //É possível usar o construtor para injetar a dependência ao invés de usar @Autowired
    @Autowired
    ProductRepository productRepository;

}
