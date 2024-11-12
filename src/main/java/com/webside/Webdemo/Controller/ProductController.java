package com.webside.Webdemo.Controller;

import com.webside.Webdemo.model.Product;
import com.webside.Webdemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
 @Autowired
    ProductService service;

 @GetMapping("/product")
    public List<Product>getProduct(){
        return service.getProduct();
    }

   @GetMapping("/product/{proId}")
    public Product getProductById(@PathVariable int proId){
     return service.getProductById(proId);
    }


    @PostMapping("/product")
    public  void addProduct(@RequestBody Product prod){
       service.addProduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod){
     service.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int propId){
      service.deleteProduct(propId);
    }

}
