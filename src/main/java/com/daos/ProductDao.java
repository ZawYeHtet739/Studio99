package com.daos;

import com.models.Product;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface ProductDao {

    Product getProductById(int id);

    List<Product> getAllProducts();


}
