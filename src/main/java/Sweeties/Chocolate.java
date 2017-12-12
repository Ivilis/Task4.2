package Sweeties;

public class Chocolate extends Sweets {
    private String type;

    public Chocolate() {}

    public Chocolate(String name, double price, double weight, String type) {
        super(name, price, weight);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", Type = " + type + "]";
    }
}
