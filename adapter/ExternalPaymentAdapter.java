public class ExternalPaymentAdapter implements PaymentProcessor {

    private final ExternalPaymentGateway externalGateway;
    private final String currency;

    // Construtor padrao com moeda BRL
    public ExternalPaymentAdapter(ExternalPaymentGateway externalGateway) {
        this(externalGateway, "BRL");
    }

    // Construtor que permite definir a moeda (BRL, USD, EUR), isolando a especificidade da moeda do OrderService
    public ExternalPaymentAdapter(ExternalPaymentGateway externalGateway, String currency) {
        this.externalGateway = externalGateway;
        this.currency = currency;
    }

    @Override
    public void pay(double amount) {
        // Adapta e traduz a chamada simples 'pay(amount)' para 'makePayment(currency, value)' da plataforma externa
        externalGateway.makePayment(currency, amount);
    }
}
