package lab2;

public class Product {
    private String name;
    private short price;
    private Provider provider;
    private int quantity;


    public Product(String name,short price, Provider provider,int quantity) {
        this.name=name;
        this.price=price;
        this.provider=provider;
        this.quantity=quantity;
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


}
