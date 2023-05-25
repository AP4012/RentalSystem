package org.example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");
        RentalStore rentalStore = new RentalStore();
        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\Lenovo\\Desktop\\rentalclone\\RentalSystem\\RentalProject\\src\\test\\java\\TestYourFork (1).json");
        AllModules models = gson.fromJson(reader, new TypeToken<AllModules>() {
        }.getType());
        String test = gson.toJson(models);
        Customer joshn = models.getCustomers().get(0);
        Customer Emily = models.getCustomers().get(1);
        Customer Brown = models.getCustomers().get(2);
        for (Item item : models.getBooks()) {
            if (item.id == 3) {
                rentalStore.rentItem(item, joshn);
            } else if (item.id == 6) {
                rentalStore.rentItem(item, joshn);
            }
        }
        for (Item item : models.getBooks()) {
            if (item.id == 1) {
                rentalStore.rentItem(item, Emily);
            } else if (item.id == 7) {
                rentalStore.rentItem(item, Emily);
            }
        }
        for (Item item : models.getBooks()) {
            if (item.id == 9) {
                rentalStore.rentItem(item, Brown);
            } else if (item.id == 4) {
                rentalStore.rentItem(item, Brown);
            }
        }
        reader.close();
        Gson writing=new Gson();
        String json = writing.toJson(models);
        String filepath="C:\\Users\\Lenovo\\Desktop\\rentalclone\\RentalSystem\\RentalProject\\src\\test\\java\\TestYourFork (1).json";
        try {
            FileWriter writer= new FileWriter(filepath);
            writer.write(json);
            writer.close();
            System.out.println("JSON DATA HAS BEEN UPDATED");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}