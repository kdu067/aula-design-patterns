public class AlertNotification extends Notification {

    public AlertNotification(NotificationSender sender) {
        super(sender);
    }

    @Override
    public void send(String message) {
        sender.send("[ALERT] " + message);
    }
}
