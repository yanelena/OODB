package lab2;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products;
    private String data;
    private Buyer buyer;

    public Order() {

    }

    public Order(Buyer buyer, String data, ArrayList<Product> products) {
        this.buyer = buyer;
        this.products = products;
        this.data = data;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public void setProduct(Product product) {
        this.products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}

