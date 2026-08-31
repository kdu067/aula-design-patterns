public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("=== Demonstracao do Padrao Singleton ===");

        // 1. Acesso atraves dos servicos
        UserService userService = new UserService();
        ReportService reportService = new ReportService();

        userService.connect();
        reportService.generate();

        // 2. Verificacao de que instancas obtidas em diferentes partes do sistema sao identicas
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        System.out.println("\n=== Verificacao de Instancia Unica ===");
        System.out.println("HashCode config1: " + System.identityHashCode(config1));
        System.out.println("HashCode config2: " + System.identityHashCode(config2));
        System.out.println("config1 == config2? " + (config1 == config2));

        // 3. Teste em ambiente com multiplas threads (Concorrencia)
        System.out.println("\n=== Teste de Concorrencia (Multi-threads) ===");
        Runnable task = () -> {
            AppConfig threadConfig = AppConfig.getInstance();
            System.out.println("Thread " + Thread.currentThread().getName() + 
                               " obteve a instancia com HashCode: " + System.identityHashCode(threadConfig));
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        Thread thread3 = new Thread(task, "Thread-3");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
    }
}
