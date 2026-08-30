public class Pizza {

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

    // Ingredientes para Pizzas Doces (Desafio Adicional)
    private boolean chocolate;
    private boolean morango;
    private boolean leiteCondensado;

    public Pizza() {
    }

    // Getters e Setters
    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getMassa() {
        return massa;
    }

    public void setMassa(String massa) {
        this.massa = massa;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public boolean isQueijo() {
        return queijo;
    }

    public void setQueijo(boolean queijo) {
        this.queijo = queijo;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isFrango() {
        return frango;
    }

    public void setFrango(boolean frango) {
        this.frango = frango;
    }

    public boolean isMilho() {
        return milho;
    }

    public void setMilho(boolean milho) {
        this.milho = milho;
    }

    public boolean isCebola() {
        return cebola;
    }

    public void setCebola(boolean cebola) {
        this.cebola = cebola;
    }

    public boolean isTomate() {
        return tomate;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public boolean isAzeitona() {
        return azeitona;
    }

    public void setAzeitona(boolean azeitona) {
        this.azeitona = azeitona;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public boolean isChocolate() {
        return chocolate;
    }

    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }

    public boolean isMorango() {
        return morango;
    }

    public void setMorango(boolean morango) {
        this.morango = morango;
    }

    public boolean isLeiteCondensado() {
        return leiteCondensado;
    }

    public void setLeiteCondensado(boolean leiteCondensado) {
        this.leiteCondensado = leiteCondensado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza {\n");
        sb.append("  Tamanho: ").append(tamanho != null ? tamanho : "Não informado").append("\n");
        sb.append("  Massa: ").append(massa != null ? massa : "Não informada").append("\n");
        if (molho != null) sb.append("  Molho: ").append(molho).append("\n");
        sb.append("  Ingredientes / Adicionais:\n");
        if (queijo) sb.append("    - Queijo\n");
        if (pepperoni) sb.append("    - Pepperoni\n");
        if (bacon) sb.append("    - Bacon\n");
        if (frango) sb.append("    - Frango\n");
        if (milho) sb.append("    - Milho\n");
        if (cebola) sb.append("    - Cebola\n");
        if (tomate) sb.append("    - Tomate\n");
        if (azeitona) sb.append("    - Azeitona\n");
        if (bordaRecheada) sb.append("    - Borda Recheada\n");
        if (chocolate) sb.append("    - Chocolate\n");
        if (morango) sb.append("    - Morango\n");
        if (leiteCondensado) sb.append("    - Leite Condensado\n");
        sb.append("}");
        return sb.toString();
    }
}
