package com.controllers;

import com.models.Category;
import com.models.Product;
import com.services.CategoryService;
import com.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.List;

@Controller
public class PageController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;


    @RequestMapping("/")
    public String showHomePage(HttpSession session , Model model){
        List<Category> categories = categoryService.getAllCategories();

        List<Product> products = productService.getAllProducts();

        Collections.reverse(products);

        session.setAttribute("categories",categories);
        model.addAttribute("products",products);
        return "home";
    }


}
