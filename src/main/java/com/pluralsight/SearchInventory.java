package com.pluralsight;
import java.util.ArrayList;
import java.util.Scanner;
public class SearchInventory {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");

        for(int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f", p.getId(), p.getName(), p.getPrice());
        }

    }

    public static ArrayList<Product> getInventory(){

        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(123 , "Frank's Red Hot", 2.5f ));
        inventory.add(new Product(124 , "potato", 1.50f ));
        inventory.add(new Product(125 , "Meds", 500.25f ));
        inventory.add(new Product(126 , "water", 3.50f ));
        inventory.add(new Product(127 , "Slim Jim", 1.25f ));
        return inventory;
    }

}
