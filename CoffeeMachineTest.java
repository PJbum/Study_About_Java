// 추상 클래스 Coffee
abstract class Coffee {
    protected String name;

    public Coffee(String name) {
        this.name = name;
    }

    public abstract double getPrice();
    public abstract String getRecipe();

    @Override
    public String toString() {
        return "Coffee: " + name;
    }
}

class Espresso extends Coffee {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double getPrice() {
        return 2.0;
    }
    @Override
    public String getRecipe() {
        return "Strong black coffee with no milk";
    }
}

class Latte extends Coffee {
    public Latte() {
        super("Latte");
    }

    @Override
    public double getPrice() {
        return 3.5;
    }
    @Override
    public String getRecipe() {
        return "Espresso with steamed milk";
    }
}

public class CoffeeMachineTest {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        Coffee latte = new Latte();

        Coffee[] menu = {espresso, latte};
        double totalCost = 0.0;

        for (Coffee coffee : menu) {
            System.out.println(coffee.toString());
            System.out.println("Price: " + coffee.getPrice());
            System.out.println("Recipe: " + coffee.getRecipe());
            totalCost += coffee.getPrice();
        }
        System.out.println("Total Cost: " + totalCost);
    }
}
