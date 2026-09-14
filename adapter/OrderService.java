public class OrderService {

    private final PaymentProcessor paymentProcessor;

    // Injecao de dependencia da interface PaymentProcessor
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void checkout(double amount) {
        paymentProcessor.pay(amount);
    }
}
