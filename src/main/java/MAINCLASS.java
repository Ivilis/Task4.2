import Sweeties.*;


public class MAINCLASS {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Batonchik", 450.90, 300, "LOW");
        Candy candy2 = new Candy("Iris Kis-Kis", 1000, 500, "VERY HIGH");
        Lollipop pop1 = new Lollipop("Chupa Chups", 150, 100, 3);
        Chocolate choko1 = new Chocolate("Cathberry", 300, 100, "Dark");
        Chocolate choko2 = new Chocolate();
        choko2.setName("Milka-Wilka");
        choko2.setPrice(200);
        choko2.setWeight(94.3);
        choko2.setType("Milky White");
        Sweets [] gift = {candy1, candy2, pop1, choko1, choko2};
        double priceSum = 0;
        double wholeWeight = 0;
        System.out.println("Состав подарка:");
        for (Sweets sweeeetz : gift) {
            priceSum += sweeeetz.getPrice();
            wholeWeight += sweeeetz.getWeight();
            System.out.println(sweeeetz.toString());
        }

        System.out.printf("Общая сумма подарка: ");
        System.out.println(priceSum + " rub.");

        System.out.printf("Общий вес подарка: ");
        System.out.println(wholeWeight + " gr.");

    }
}
