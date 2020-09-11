package lab1.product;

import lab1.provider.Provider;

public class Product {
     private String name;
    private short price;
    private Provider provider;
    private int quantity;
    private int data;

    public Product(String name,short price, Provider provider) {
    this.name=name;
    this.price=price;
    this.provider=provider;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(short price) {
        this.price = price;
    }

    public short getPrice() {
        return price;
    }

    public Provider getProvider() {
        return provider;
    }


    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
