package lab2;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        Buyer buyer = new Buyer("vasya", "petrov");
        ArrayList<Product> products = new ArrayList<Product>();
        Provider provider = new Provider("zavod№5", "petrovskaya 12");
        Product product = new Product("cookie", (short) 13, provider, 4);
        products.add(product);
        Order order = new Order(buyer,"10.09.2020",products);
        Shop shop=new Shop("magnit");
        ArrayList<Order> orders=new ArrayList<Order>();
        orders.add(order);
        shop.setOrders(orders);
        shop.printOrder();
        System.out.println(shop.findOrderByBuyersName("vasya"));
        SaveDB.saveOrderList(orders);
        System.out.println(ReadDB.readJsonToOrdersList());
    }
}