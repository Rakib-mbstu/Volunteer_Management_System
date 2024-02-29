package com.volunteer.volunteermanagementsystem;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendMail {
    public static void mailer(String Mail) {
        String from = "demomailer36@gmail.com";

        Properties properties = System.getProperties();


        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("islammir1111@gmail.com", "rplqfzzksjnzbcmh");

            }

        });

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(Mail));

            // Set Subject: header field
            message.setSubject("This is the a try");

            // Now set the actual message
            //message.setText("This is actual message");

            // Send the actual HTML message.
            message.setContent(
                    "<html><body>" +
                            "<h1>Hello there!</h1>" +
                            "<p>Thank you for your support!</p>" +
                            "</body></html>",
                    "text/html");

            System.out.println("sending...");
            // Send message
            Transport.send(message);
            System.out.println("Sent message successfully....");
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }
}
