package lab2;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class SaveDB {
    public static void saveOrderList(ArrayList<Order> orders) throws IOException {
        if (orders != null && orders.size() > 0) {
            Gson gson = new Gson();
            String orderAsJason = gson.toJson(orders);
            System.out.println(orderAsJason);
            OutputStream os = new FileOutputStream(new File("orders.json"));
            os.write(orderAsJason.getBytes("UTF-8"));
            os.flush();


        }
    }
}
