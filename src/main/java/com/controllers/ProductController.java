package com.controllers;

import com.models.Category;
import com.models.Color;
import com.models.Product;
import com.models.Size;
import com.services.CategoryService;
import com.services.ColorService;
import com.services.ProductService;
import com.services.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ColorService colorService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @Autowired
    private SizeService sizeService;

    @RequestMapping("/products/{cat_id}")
    public String ShowProductsPage(Model model, @PathVariable("cat_id") String cat_id) {
        Category category = categoryService.getCategoryById(Integer.parseInt(cat_id));
        List<Product> products = category.getProducts();
        model.addAttribute("category", category);
        model.addAttribute("products", products);
        return "products";
    }

    @RequestMapping("/singleproduct/{product_id}")
    public String ShowSingleProductPage(Model model, @PathVariable("product_id") String product_id) {
        Product product = productService.getProductById(Integer.parseInt(product_id));

        int cat_id = product.getCat_id();
        Category category = categoryService.getCategoryById(cat_id);

        List<Color> colors = colorService.getColorsById(cat_id);
        List<Size> sizes = sizeService.getSizesById(cat_id);

        model.addAttribute("product", product);
        model.addAttribute("category", category);
        model.addAttribute("colors", colors);
        model.addAttribute("sizes", sizes);

        return "singleproduct";
    }


}
