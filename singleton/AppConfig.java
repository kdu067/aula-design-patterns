public class AppConfig {

    // Volatile garante visibilidade e evita reordenacao de instrucoes entre threads
    private static volatile AppConfig instance;

    private String databaseUrl;
    private String environment;

    // Construtor privado previne a criacao de novas instancias com 'new' fora da classe
    private AppConfig() {
        this.databaseUrl = "jdbc:mysql://localhost/app";
        this.environment = "development";
    }

    // Ponto global de acesso thread-safe utilizando Double-Checked Locking
    public static AppConfig getInstance() {
        if (instance == null) {
            synchronized (AppConfig.class) {
                if (instance == null) {
                    instance = new AppConfig();
                }
            }
        }
        return instance;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public void setDatabaseUrl(String databaseUrl) {
        this.databaseUrl = databaseUrl;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
