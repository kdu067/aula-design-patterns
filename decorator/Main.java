public class Main {

    public static void main(String[] args) {
        System.out.println("=== 1. Bebida sem Adicionais ===");
        Beverage plainCoffee = new Coffee();
        printBeverage(plainCoffee);

        Beverage plainTea = new Tea();
        printBeverage(plainTea);

        System.out.println("\n=== 2. Cafe com Leite e Chocolate (R$ 8,50) ===");
        Beverage coffeeWithMilkAndChocolate = new ChocolateDecorator(new MilkDecorator(new Coffee()));
        printBeverage(coffeeWithMilkAndChocolate);

        System.out.println("\n=== 3. Cha com Leite (R$ 5,50) ===");
        Beverage teaWithMilk = new MilkDecorator(new Tea());
        printBeverage(teaWithMilk);

        System.out.println("\n=== 4. Bebida com Duas Porcoes do Mesmo Adicional (Duplo Leite) ===");
        Beverage doubleMilkCoffee = new MilkDecorator(new MilkDecorator(new Coffee()));
        printBeverage(doubleMilkCoffee);

        System.out.println("\n=== 5. Desafio Adicional: Adicional de Caramelo ===");
        Beverage deluxeCoffee = new CaramelDecorator(new WhippedCreamDecorator(new MilkDecorator(new Coffee())));
        printBeverage(deluxeCoffee);
    }

    private static void printBeverage(Beverage beverage) {
        System.out.println("Descricao: " + beverage.getDescription());
        System.out.printf("Custo Total: R$ %.2f\n", beverage.getCost());
    }
}
