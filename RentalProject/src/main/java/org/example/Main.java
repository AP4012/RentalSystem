package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.io.FileWriter;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\NS\\IdeaProjects\\untitled9\\src\\test\\TestYourFork.json");
        AllModules allModules = gson.fromJson(reader, new TypeToken<AllModules>() {
        }.getType());

        Customer Joshn = allModules.getCustomers().get(0);
        Customer Emily = allModules.getCustomers().get(1);
        Customer Brown = allModules.getCustomers().get(2);

        for (Item tempItem : allModules.getBooks()) {
            if (tempItem.id == 3) RentalStore.rentItem(tempItem, Joshn);
            else if (tempItem.id == 6) {
                RentalStore.rentItem(tempItem, Joshn);
            }
        }

        for (Item tempItem : allModules.getBooks()) {
            if (tempItem.id == 1) RentalStore.rentItem(tempItem, Emily);
            else if (tempItem.id == 7) {
                RentalStore.rentItem(tempItem, Emily);
            }
        }

        for (Item tempItem : allModules.getBooks()) {
            if (tempItem.id == 9) RentalStore.rentItem(tempItem, Brown);
            else if (tempItem.id == 4) {
                RentalStore.rentItem(tempItem, Brown);
            }
        }
        reader.close();
        Gson gson1 = new Gson();
        String json = gson1.toJson(allModules);
        String filePath = "C:\\Users\\NS\\IdeaProjects\\untitled9\\src\\test\\TestYourFork.json";
        try {
            java.io.FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();
            System.out.println("JSON data has been written to the file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
