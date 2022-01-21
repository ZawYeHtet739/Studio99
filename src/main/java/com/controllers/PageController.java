package com.controllers;

import com.models.Category;
import com.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class PageController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String showHomePage(HttpSession session , Model model){
        List<Category> categories = categoryService.getAllCategories();
        session.setAttribute("categories",categories);
        return "home";
    }
}
