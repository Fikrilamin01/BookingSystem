/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author fikri
 */
public class JavaMailUtil {
    public static void sendMail(String recepientEmail) throws Exception{
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String myAccountEmail = "sporthallbookingsystem@gmail.com";
        String password = "sporthallutm";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(myAccountEmail,password);
            }
        });
        
        Message message = prepareMessage(session, recepientEmail, myAccountEmail);
        Transport.send(message);
    }

    private static Message prepareMessage(Session session, String recepientEmail, String myAccountEmail) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(myAccountEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepientEmail));
            message.setSubject("Congratulation, you have successfuly book the facility");
            String htmlCode ="<h1>Your Booking is confirmed</h1></br>"
                    + "<h2>Please login into the apps to see the details of your booking information<h2>";
            message.setContent(htmlCode, "text/html");
            return message;
        } catch (Exception ex) {
            Logger.getLogger(JavaMailUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
