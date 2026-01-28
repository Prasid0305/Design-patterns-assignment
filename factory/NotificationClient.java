package assignment.factory;

import java.util.Scanner;
/**
 * NotificationClient is the client class that
 * demonstrates the usage of the Factory Design Pattern.
 *
 * It takes user input and uses NotificationFactory
 * to create the appropriate Notification object.
 */
public class NotificationClient {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the notification type: sms, push, email:\n");
        String userChoice = scanner.nextLine();
        Notification notification1 = NotificationFactory.getNotification(userChoice);
        notification1.sendNotification();

    }
}
