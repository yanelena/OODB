package lab1;

public class Buyer {
    private String name;
    private String secondName;


    public Buyer() {

    }

    public Buyer(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;

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



}
