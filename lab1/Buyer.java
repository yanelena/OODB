package lab1;

public class Buyer {
    private String name;
    private String secondName;
    private Order order;

    public Buyer() {

    }

    public Buyer(String name, String secondName, Order order) {
        this.name = name;
        this.secondName = secondName;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
