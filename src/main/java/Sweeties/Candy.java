package Sweeties;

public class Candy extends Sweets {
    private String cariesDanger;

    public Candy(){}

    public Candy(String name, double price, double weight, String cariesDanger) {
        super(name, price, weight);
        this.cariesDanger = cariesDanger;
    }

    public String getCariesDanger() {
        return cariesDanger;
    }

    public void setCariesDanger(String cariesDanger) {
        this.cariesDanger = cariesDanger;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", CariesDanger = " + cariesDanger + "]";
    }
}
