package cafeteria;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Combo Tradicional ===");
        OrderService traditionalOrder = new OrderService(new TraditionalComboFactory());
        traditionalOrder.createCombo();

        System.out.println("\n=== Combo Fitness ===");
        OrderService fitnessOrder = new OrderService(new FitnessComboFactory());
        fitnessOrder.createCombo();

        System.out.println("\n=== Combo Premium ===");
        OrderService premiumOrder = new OrderService(new PremiumComboFactory());
        premiumOrder.createCombo();

        System.out.println("\n=== Combo Vegano ===");
        OrderService veganOrder = new OrderService(new VeganComboFactory());
        veganOrder.createCombo();
    }
}
