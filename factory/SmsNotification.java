package assignment.factory;
/**
 * SmsNotification is a concrete implementation
 * of the Notification interface.
 *
 * It represents sending notifications via SMS.
 */
public class SmsNotification implements Notification{
    /**
     * Sends an SMS notification.
     */
    @Override
    public void sendNotification() {
        System.out.println("sms notification alert ");
    }
}
