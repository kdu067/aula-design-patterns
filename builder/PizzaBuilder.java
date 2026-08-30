public class PizzaBuilder {

    private String tamanho;
    private String massa;
    private String molho;
    private boolean queijo;
    private boolean pepperoni;
    private boolean bacon;
    private boolean frango;
    private boolean milho;
    private boolean cebola;
    private boolean tomate;
    private boolean azeitona;
    private boolean bordaRecheada;

    // Ingredientes Doces (Desafio Adicional)
    private boolean chocolate;
    private boolean morango;
    private boolean leiteCondensado;

    // --- Métodos de Configuração (Interface Fluente) ---

    public PizzaBuilder tamanho(String tamanho) {
        this.tamanho = tamanho;
        return this;
    }

    public PizzaBuilder size(String size) {
        return tamanho(size);
    }

    public PizzaBuilder massa(String massa) {
        this.massa = massa;
        return this;
    }

    public PizzaBuilder dough(String dough) {
        return massa(dough);
    }

    public PizzaBuilder molho(String molho) {
        this.molho = molho;
        return this;
    }

    public PizzaBuilder sauce(String sauce) {
        return molho(sauce);
    }

    public PizzaBuilder queijo(boolean queijo) {
        this.queijo = queijo;
        return this;
    }

    public PizzaBuilder queijo() {
        return queijo(true);
    }

    public PizzaBuilder cheese(boolean cheese) {
        return queijo(cheese);
    }

    public PizzaBuilder pepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder pepperoni() {
        return pepperoni(true);
    }

    public PizzaBuilder bacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public PizzaBuilder bacon() {
        return bacon(true);
    }

    public PizzaBuilder frango(boolean frango) {
        this.frango = frango;
        return this;
    }

    public PizzaBuilder frango() {
        return frango(true);
    }

    public PizzaBuilder milho(boolean milho) {
        this.milho = milho;
        return this;
    }

    public PizzaBuilder milho() {
        return milho(true);
    }

    public PizzaBuilder cebola(boolean cebola) {
        this.cebola = cebola;
        return this;
    }

    public PizzaBuilder cebola() {
        return cebola(true);
    }

    public PizzaBuilder tomate(boolean tomate) {
        this.tomate = tomate;
        return this;
    }

    public PizzaBuilder tomate() {
        return tomate(true);
    }

    public PizzaBuilder azeitona(boolean azeitona) {
        this.azeitona = azeitona;
        return this;
    }

    public PizzaBuilder azeitona() {
        return azeitona(true);
    }

    public PizzaBuilder bordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
        return this;
    }

    public PizzaBuilder bordaRecheada() {
        return bordaRecheada(true);
    }

    public PizzaBuilder stuffedCrust(boolean stuffedCrust) {
        return bordaRecheada(stuffedCrust);
    }

    // --- Ingredientes Doces (Desafio Adicional) ---

    public PizzaBuilder chocolate(boolean chocolate) {
        this.chocolate = chocolate;
        return this;
    }

    public PizzaBuilder chocolate() {
        return chocolate(true);
    }

    public PizzaBuilder morango(boolean morango) {
        this.morango = morango;
        return this;
    }

    public PizzaBuilder morango() {
        return morango(true);
    }

    public PizzaBuilder leiteCondensado(boolean leiteCondensado) {
        this.leiteCondensado = leiteCondensado;
        return this;
    }

    public PizzaBuilder leiteCondensado() {
        return leiteCondensado(true);
    }

    // --- Método Build ---

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setTamanho(this.tamanho);
        pizza.setMassa(this.massa);
        pizza.setMolho(this.molho);
        pizza.setQueijo(this.queijo);
        pizza.setPepperoni(this.pepperoni);
        pizza.setBacon(this.bacon);
        pizza.setFrango(this.frango);
        pizza.setMilho(this.milho);
        pizza.setCebola(this.cebola);
        pizza.setTomate(this.tomate);
        pizza.setAzeitona(this.azeitona);
        pizza.setBordaRecheada(this.bordaRecheada);

        // Atributos Doces
        pizza.setChocolate(this.chocolate);
        pizza.setMorango(this.morango);
        pizza.setLeiteCondensado(this.leiteCondensado);

        return pizza;
    }
}
