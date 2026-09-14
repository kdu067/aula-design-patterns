public class Main {

    public static void main(String[] args) {
        // Instanciacao das implementacoes dos canais de envio
        NotificationSender email = new EmailSender();
        NotificationSender sms = new SmsSender();
        NotificationSender whatsApp = new WhatsAppSender();

        System.out.println("=== 1. Notificacoes de Alerta (AlertNotification) ===");
        Notification alertEmail = new AlertNotification(email);
        alertEmail.send("Your account was accessed from a new device.");

        Notification alertSms = new AlertNotification(sms);
        alertSms.send("Security code: 849201");

        System.out.println("\n=== 2. Notificacoes de Lembrete (ReminderNotification) ===");
        Notification reminderSms = new ReminderNotification(sms);
        reminderSms.send("Your appointment starts in one hour.");

        Notification reminderWhatsApp = new ReminderNotification(whatsApp);
        reminderWhatsApp.send("Don't forget to pay your bill today.");

        System.out.println("\n=== 3. Notificacoes de Aviso (WarningNotification - Desafio Adicional) ===");
        Notification warningEmail = new WarningNotification(email);
        warningEmail.send("Server disk space is above 90%.");

        Notification warningWhatsApp = new WarningNotification(whatsApp);
        warningWhatsApp.send("Scheduled maintenance in 30 minutes.");
    }
}
