/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.eventsmanagement;

/**
 *
 * @author fa22-bse-067
 */




import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNumber;
    private String message;

    public SMSSupportListener(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public void update(String eventType, File file) {
        String formattedMessage = message.replace("%s", file.getName());
        if (formattedMessage.length() > 160) {
            System.out.println("Warning: SMS length exceeds 160 characters. Please define a valid default SMS.");
        } else {
            // Simulate sending SMS
            System.out.println("Sending SMS to " + phoneNumber + ": " + formattedMessage);
        }
    }
}
