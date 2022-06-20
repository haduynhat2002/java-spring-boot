package com.example.t2009m1javaspingboot.repository;

import com.example.t2009m1javaspingboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Integer> {
}
