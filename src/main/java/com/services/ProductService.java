package com.services;

import com.daos.ProductDao;
import com.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product getProductById(int id) {
        Product product = productDao.getProductById(id);
        return product;
    }

    public List<Product> getAllProducts(){
        List<Product> products = productDao.getAllProducts();
        return products;
    }

}
