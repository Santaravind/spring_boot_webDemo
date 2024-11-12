package com.webside.Webdemo.model;

public class Product {
    public int getProId() {
        return proId;
    }

    public Product(int proId, String proName, int price) {
        this.proId = proId;
        this.proName = proName;
        this.price = price;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", price=" + price +
                '}';
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private  int proId;
    private String proName;
    private  int price;
}
