package lab2;

import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadDB {
    public static ArrayList<Order> readJsonToOrdersList() throws IOException {
        String pStr = "";
        File file = new File("orders.json");

        if (file.exists()) {
            pStr = new String(Files.readAllBytes(file.toPath()));
        } else {
            System.out.println("File persons.json not found!");
        }
        Gson gson = new Gson();
        Order[] plst = gson.fromJson(pStr, Order[].class);
ArrayList<Order> result=new ArrayList<Order>(Arrays.asList(plst));
        return result;
    }
}
