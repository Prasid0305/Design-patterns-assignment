package assignment.factory;
/**
 * Notification is a common interface for all
 * types of notifications.
 *
 * This interface is part of the Factory Design Pattern.
 * Concrete notification classes implement this interface
 * to provide their specific notification behavior.
 */

public interface Notification {
    /**
     * Sends a notification.
     * Each implementation defines how the notification
     * is delivered (SMS, Email, Push, etc.).
     */
    void sendNotification();

}
