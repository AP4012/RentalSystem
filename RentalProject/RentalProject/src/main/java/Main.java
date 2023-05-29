import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hi!");
        Gson gson = new Gson();
        Reader reader = new FileReader("C:\\Users\\nilofar\\Rental Clone\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json");//open the input file
        AllModules allModules = gson.fromJson(reader, new TypeToken<AllModules>() {
        }.getType());

        Customer Joshn = allModules.getCustomers().get(0);
        Customer Emily = allModules.getCustomers().get(1);
        Customer Michael = allModules.getCustomers().get(2);

        for (Book newBook : allModules.getBooks()) {
            if (newBook.getId() == 3) {
                RentalStore.rentBook(newBook, Joshn);
            } else if (newBook.getId() == 6) {
                RentalStore.rentBook(newBook, Joshn);
            }
        }
        for (Book newBook1 : allModules.getBooks()) {
            if (newBook1.getId() == 1) {
                RentalStore.rentBook(newBook1, Emily);
            } else if (newBook1.getId() == 7) {
                RentalStore.rentBook(newBook1, Emily);
            }
        }
        for (Book newBook2 : allModules.getBooks()) {
            if (newBook2.getId() == 9) {
                RentalStore.rentBook(newBook2, Michael);
            } else if (newBook2.getId() == 4) {
                RentalStore.rentBook(newBook2, Michael);
            }
        }

        for (Game newGame : allModules.getGames()) {
            if (newGame.getId() == 3) {
                RentalStore.rentGame(newGame, Joshn);
            } else if (newGame.getId() == 6) {
                RentalStore.rentGame(newGame, Joshn);
            }
        }
        for (Game newGame1 : allModules.getGames()) {
            if (newGame1.getId() == 1) {
                RentalStore.rentGame(newGame1, Emily);
            } else if (newGame1.getId() == 7) {
                RentalStore.rentGame(newGame1, Emily);
            }
        }
        for (Game newGame2 : allModules.getGames()) {
            if (newGame2.getId() == 9) {
                RentalStore.rentGame(newGame2, Michael);
            } else if (newGame2.getId() == 4) {
                RentalStore.rentGame(newGame2, Michael);
            }
        }

        reader.close();



        Gson writing = new Gson();
        String json = writing.toJson(allModules);
        String filePath ="C:\\Users\\nilofar\\Rental Clone\\RentalSystem\\RentalProject\\src\\test\\TestYourFork.json";
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();
            System.out.println("JSON Data has been updated");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    }

