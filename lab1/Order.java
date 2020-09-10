package lab1;

import lab1.product.Product;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;

    public Order() {

    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
