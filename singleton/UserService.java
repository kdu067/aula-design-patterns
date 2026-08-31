public class UserService {

    public void connect() {
        AppConfig config = AppConfig.getInstance();
        System.out.println("[UserService] Connecting to " + config.getDatabaseUrl());
    }
}
