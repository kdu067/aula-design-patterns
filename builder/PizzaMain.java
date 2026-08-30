public class PizzaMain {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE PEDIDOS DE PIZZA (PADRÃO BUILDER) ===\n");

        // 1. Pizza Calabresa
        Pizza calabresa = new PizzaBuilder()
                .tamanho("Grande")
                .massa("Tradicional")
                .molho("Tomate")
                .queijo(true)
                .pepperoni(true)
                .cebola(true)
                .azeitona(true)
                .build();

        System.out.println("1. PIZZA CALABRESA / PEPPERONI:");
        System.out.println(calabresa);
        System.out.println("----------------------------------------\n");

        // 2. Pizza Portuguesa
        Pizza portuguesa = new PizzaBuilder()
                .tamanho("Grande")
                .massa("Tradicional")
                .molho("Tomate Especial")
                .queijo(true)
                .bacon(true)
                .milho(true)
                .cebola(true)
                .tomate(true)
                .azeitona(true)
                .bordaRecheada(true)
                .build();

        System.out.println("2. PIZZA PORTUGUESA:");
        System.out.println(portuguesa);
        System.out.println("----------------------------------------\n");

        // 3. Pizza Personalizada
        Pizza personalizada = new PizzaBuilder()
                .tamanho("Média")
                .massa("Fina e Crocante")
                .molho("Barbecue")
                .queijo(true)
                .frango(true)
                .bacon(true)
                .milho(true)
                .bordaRecheada(true)
                .build();

        System.out.println("3. PIZZA PERSONALIZADA (Frango com Bacon):");
        System.out.println(personalizada);
        System.out.println("----------------------------------------\n");

        // 4. Pizza Doce (Desafio Adicional)
        Pizza doce = new PizzaBuilder()
                .tamanho("Média")
                .massa("Fina Doce")
                .chocolate(true)
                .morango(true)
                .leiteCondensado(true)
                .bordaRecheada(true)
                .build();

        System.out.println("4. PIZZA DOCE (Sensação - Chocolate, Morango e Leite Condensado):");
        System.out.println(doce);
        System.out.println("----------------------------------------\n");
    }
}
