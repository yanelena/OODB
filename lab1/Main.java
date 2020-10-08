package lab1;

import lab1.product.Product;
import lab1.provider.Provider;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Buyer buyer = new Buyer("vasya", "petrov");
        ArrayList<Product> products = new ArrayList<>();
        Provider provider = new Provider("zavod№5", "petrovskaya 12");
        Product product = new Product("cookie", (short) 13, provider, 4);
        products.add(product);
        Order order = new Order(buyer,"10.09.2020",products);
        Shop shop=new Shop("magnit");
        ArrayList<Order> orders=new ArrayList<>();
        orders.add(order);
        shop.setOrders(orders);
        shop.printOrder();

    }
}
