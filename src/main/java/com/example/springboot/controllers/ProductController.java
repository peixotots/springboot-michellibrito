package com.example.springboot.controllers;

import com.example.springboot.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //Ponto de injeção para acesso aos métodos JPA de ProductRepository
    @Autowired
    ProductRepository productRepository;

}
