public class ReportService {

    public void generate() {
        AppConfig config = AppConfig.getInstance();
        System.out.println("[ReportService] Environment: " + config.getEnvironment());
    }
}
