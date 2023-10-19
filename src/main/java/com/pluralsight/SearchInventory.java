package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.*;
import java.util.Comparator;

public class SearchInventory {

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

    }
        public static ArrayList<Product> getInventory () {

            ArrayList<Product> inventory = new ArrayList<Product>();
            ArrayList<Product>items = new ArrayList<Product>();
            try {
                //create filereader and point to file
                FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
                //create buffreader
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String input;
                int counter = 0;

                //read text file

                int counter1 = 0;
                while ((input = bufferedReader.readLine()) != null) {
                    String[] line = input.split("\\|");
                    int id = Integer.parseInt(line[0]);
                    String name = line[1];
                    float price = Float.parseFloat(line[2]);
                    //add each thing into arrayList of inventory
                    counter1++;
                    items.add(new Product(id,name,price));

                    Collections.sort(items,Product.comp);
                }

                Scanner scanner = new Scanner(System.in);
                System.out.println("We carry the following inventory: ");

                for (int i = 0; i < items.size(); i++) {
                    items.get(i);
                    System.out.printf("id: %d %s - Price: $%.2f", items.get(i).getId(), items.get(i).getName(), items.get(i).getPrice());
                }

            } catch (IOException e) {
                e.getStackTrace();
            }



          return items;
        }

}
