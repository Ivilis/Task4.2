package Sweeties;

public class Lollipop extends Sweets {
    private int diametr;

    public Lollipop(){}

    public Lollipop(String name, double price, double weight, int diametr) {
        super(name, price, weight);
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Lollipop [" + super.toString() + ", Diametr = " + diametr + " cm]";
    }
}
