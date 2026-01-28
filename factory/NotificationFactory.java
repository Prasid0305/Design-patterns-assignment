package assignment.factory;
/**
 * NotificationFactory is a Factory class that
 * creates Notification objects based on user input.
 *
 * This class encapsulates object creation logic
 * and returns the appropriate Notification
 * implementation.
 */
public class NotificationFactory {
    /**
     * Returns a Notification object based on
     * the given notification type.
     *
     * @param notificationType type of notification
     *                         (email, sms, push)
     * @return Notification object or null if type is invalid
     */
    public static Notification  getNotification(String notificationType){
        if (notificationType.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("push")) {
            return new PushNotification();

        } else if (notificationType.equalsIgnoreCase("sms")) {
            return new SmsNotification();

        }
        return null;
    }
}
