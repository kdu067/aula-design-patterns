package cafeteria;

public class PremiumCoffee implements Coffee {
    @Override
    public void prepare() {
        System.out.println("Preparing Special Coffee");
    }
}
