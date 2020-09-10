package lab1;

import lab1.product.Product;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<Buyer> buyers;
    private ArrayList<Product> products;

    public Shop() {

    }

    public ArrayList<Buyer> getBuyers() {
        return buyers;
    }

    public void setBuyers(ArrayList<Buyer> buyers) {
        this.buyers = buyers;
    }

    public void printOrder() {
        for (int i = 0; i < buyers.size(); i++) {
            System.out.println("Buyer: " + buyers.get(i).getName() + buyers.get(i).getSecondName());
            System.out.println("Order: ");
            Order currentOrder = buyers.get(i).getOrder();
            for (int j = 0; j < currentOrder.getProducts().size(); j++) {
                System.out.print(currentOrder.getProducts().get(j).getName());
                System.out.print(currentOrder.getProducts().get(j).getPrice());
                System.out.print(currentOrder.getProducts().get(j).getProvider());
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
}
