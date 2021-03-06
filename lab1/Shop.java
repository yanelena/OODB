package lab1;

import lab1.product.Product;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Order> orders;
    private ArrayList<Product> products;

    public Shop() {

    }

    public Shop(String name) {
        this.name = name;
    }

    public Shop(String name, ArrayList<Order> orders) {
        this.name = name;
        this.orders = orders;
    }


    public void printOrder() {
        for (int i = 0; i < orders.size(); i++) {
            System.out.println("Buyer: " + orders.get(i).getBuyer().getName() + orders.get(i).getBuyer().getSecondName());
            System.out.println("Order: ");
            Order currentOrder = orders.get(i);
            for (int j = 0; j < currentOrder.getProducts().size(); j++) {
                System.out.println(currentOrder.getProducts().get(j).getName());
                System.out.println(currentOrder.getProducts().get(j).getPrice());
                System.out.println(currentOrder.getProducts().get(j).getProvider().getName());
            }
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public void setOrder(Order order) {
        this.orders.add(order);
    }
}
