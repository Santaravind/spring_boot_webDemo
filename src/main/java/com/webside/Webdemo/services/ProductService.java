package com.webside.Webdemo.services;

import com.webside.Webdemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products=new ArrayList<>( Arrays.asList(new Product(101,"Iphone",5000),
            new Product(102,"Camra",6000),
            new Product(103,"Pen",300)));
    public List<Product>getProduct(){
        return products;
    }
    public  Product getProductById(int proId){
        return products.stream()
                .filter(p->p.getProId()==proId)
                .findFirst().orElse(new Product(100,"no item",0));
    }

    public  void addProduct(Product prod){
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0; i<products.size();i++){
            if (products.get(i).getProId()==prod.getProId())
              index=i;
            products.set(index,prod);
        }

    }

//    public  void  deleteProduct(int prodId){
//        int index=-1;
//        for(int i=0; i<products.size();i++){
//            if (products.get(i).getProId()==prodId)
//                index=i;
//            products.remove(index);
//        }
//    }

    public void deleteProduct(int prodId) {
        int index=0;
        for(int i=0; i<products.size();i++) {
            if (products.get(i).getProId() == prodId)
                index = i;

        }



        products.remove(index);
    }

}
