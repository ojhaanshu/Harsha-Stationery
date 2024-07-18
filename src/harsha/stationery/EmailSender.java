/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harsha.stationery;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

    public static void main(String[] args) {

        final String username = "annojha91@gmail.com"; // Your email address
        final String password = "anshuo@30-07"; // Your email password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // You can use another SMTP server
        props.put("mail.smtp.port", "587"); // Port for TLS

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("anshuojha91@gmail.com")); // Same email address as username
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("annojha91@gmail.com")); // Customer's email
            message.setSubject("Subject of the Email");
            message.setText("Dear Customer,"
                    + "\n\n This is a sample email from JavaMail API.");

            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
