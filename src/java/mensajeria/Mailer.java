/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajeria;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author USUARIO
 */
public class Mailer {
    public static void content(Integer codigo, String asunto, String mensaje, String destinatario) throws UnsupportedEncodingException{
        
        final String user = "timbresi2020@gmail.com"; //cambiará en consecuencia al servidor utilizado
        final String pass = "timbre-SI2020";
        
        
        //1st paso = obtener el objeto de la sesion
        
        
    Properties propertie = new Properties();
        propertie.setProperty("mail.smtp.host", "smtp.gmail.com");
        propertie.setProperty("mail.smtp.starttls.enable", "true");
        propertie.setProperty("mail.smtp.port", "587");
        propertie.setProperty("mail.smtp.starttls.required", "false");
        propertie.setProperty("mail.smtp.auth", "true");
        propertie.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
        
        
    Session session;
        session = Session.getInstance(propertie, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(user, pass);
            }
        });
        
        
        //2nd paso = componer mensaje
        
        
    try{
        BodyPart texto = new MimeBodyPart();
            texto.setContent(mensaje, "text/html");
        MimeMultipart multiparte = new MimeMultipart();
            multiparte.addBodyPart(texto);
        MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user, "Timbre SI"));
            
            InternetAddress[] destinatarios = {
                new InternetAddress(destinatario),
                new InternetAddress("lvgomez565@misena.edu.co"),
                new InternetAddress("luvagoba@gmail.com")
            };
            
       message.setRecipients(Message.RecipientType.TO,destinatarios);
       message.setSubject(asunto);
       message.setContent(multiparte, "text/html; charset=utf-8");
       
       
       //3rd paso = enviar mensaje
       
       
       Transport.send(message);
       
        System.out.println("Done");
            
    }   catch (MessagingException me) {
            throw new RuntimeException(me);
        }
        
        
    }
}
