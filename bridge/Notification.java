public abstract class Notification {

    // Ponte (Bridge) para a interface de implementacao do canal de envio
    protected NotificationSender sender;

    public Notification(NotificationSender sender) {
        this.sender = sender;
    }

    public abstract void send(String message);
}
