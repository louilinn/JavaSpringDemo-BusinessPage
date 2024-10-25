package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

  private static final List<Product> products = new ArrayList<>();
  // mock data:
  static {
    products.add(new Product("Solpanel", 1000.0, 0));
    products.add(new Product("Litet vindkraftverk", 2000.0, 1));
    products.add(new Product("Vattenrenare", 500.0, 2));
  }
  // id init, needed for implementing delete
  private static int curId = 3;

  @GetMapping("/products")
  private String getProductPage(Model model) {
    model.addAttribute("products", products);
    model.addAttribute("newProduct", new Product(null, 0, 0));

    return "products";
  }

  @PostMapping("/add-product")
  private String addProduct(@RequestParam("name") String name, @RequestParam("price") double price) {
    products.add(new Product(name, price, curId++));

    return "redirect:/products";
  }
}
