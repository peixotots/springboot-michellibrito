package com.example.springboot.repositories;

import com.example.springboot.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

//JpaRepository: interface do Spring Data que fornece operações CRUD para uma entidade
//Parâmetros necessários: o tipo da entidade (ProductModel) e o tipo do ID (UUID)
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

}
