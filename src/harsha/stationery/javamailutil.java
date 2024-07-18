/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harsha.stationery;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
//import avax.activation.DataHandler;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.AddressException;
/**
 *
 * @author Jay Tiwari
 */
public class javamailutil {
    public static void sendMail(String recipient) {
        try{
        System.out.println("preparing to send message");
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
           
           String myAccount = "annojha91@gmail.com";
           String password = "anshuo@30-07";
         System.out.println("preparing to send message");
         
         Session session=Session.getInstance(properties,new Authenticator(){
             @Override
             protected PasswordAuthentication getPasswordAuthentication(){
                // if(PasswordAuthentication ==true){
                     
                 
                  System.out.println("ïnside a session");
                 return new PasswordAuthentication(myAccount,password);
         }   
              
             });
           
                   
           
           System.out.println("preparing to send message");
           Message message = prepareMessage(session,myAccount,recipient);
           Transport.send(message);
           System.out.println("Message sent Successfully");
        }catch(MessagingException mt)
        {
          System.out.println(mt);
        }
    } 
         public static  Message prepareMessage(Session session, String myAccount,String recipient){
             try{
                 System.out.println("preparing to send message");
                 Message message = new MimeMessage(session);
                 System.out.println("next to probable problem");
                 message.setFrom(new InternetAddress(myAccount));
                 System.out.println("preparing to send message");
                 message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
                 message .setSubject("Bill  of Harsha's Stationery");
                 message.setText("this is first email");
                 return message;
             }
             catch (MessagingException ex){
                //Logger.getLogger(javamailutil.class.getName()).log(Level.SEVERE,null,e);
                System.out.println(ex);
             }
             return null;
             
    }
}
   
