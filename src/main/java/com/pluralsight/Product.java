package com.pluralsight;

import java.util.Comparator;

public class Product {

    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }

    public static Comparator<Product> comp = new Comparator<Product>() {
        @Override
        public int compare(Product o1, Product o2) {
            String one = o1.getName();
            String two = o2.getName();
            return one.compareToIgnoreCase(two);
        }
    };
}
