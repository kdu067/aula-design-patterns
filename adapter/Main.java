public class Main {

    public static void main(String[] args) {
        System.out.println("=== 1. Pagamento via Processador Legado (CreditCardPayment) ===");
        PaymentProcessor legacyProcessor = new CreditCardPayment();
        OrderService legacyOrderService = new OrderService(legacyProcessor);
        legacyOrderService.checkout(150.00);

        System.out.println("\n=== 2. Pagamento via Adapter (ExternalPaymentGateway - BRL) ===");
        ExternalPaymentGateway externalGateway = new ExternalPaymentGateway();
        PaymentProcessor adapterBrl = new ExternalPaymentAdapter(externalGateway, "BRL");
        OrderService orderServiceBrl = new OrderService(adapterBrl);
        orderServiceBrl.checkout(250.50);

        System.out.println("\n=== 3. Pagamento via Adapter com Outras Moedas (USD e EUR) ===");
        PaymentProcessor adapterUsd = new ExternalPaymentAdapter(externalGateway, "USD");
        OrderService orderServiceUsd = new OrderService(adapterUsd);
        orderServiceUsd.checkout(99.99);

        PaymentProcessor adapterEur = new ExternalPaymentAdapter(externalGateway, "EUR");
        OrderService orderServiceEur = new OrderService(adapterEur);
        orderServiceEur.checkout(45.00);
    }
}
