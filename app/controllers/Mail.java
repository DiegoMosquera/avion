package controllers;

import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;

import java.util.*;

public class Mail {    
    String d_email = "diegomosquera94@gmail.com",
            d_password = "diego1994", //your email password
            d_host = "smtp.gmail.com",
            d_port = "465",
            m_subject = "VUELOS - CONFIRMACION DE REGISTRO";
            
    	
    
    public Mail(String m_to, String m_text) {
        Properties props = new Properties();
        props.put("mail.smtp.user", d_email);
        props.put("mail.smtp.host", d_host);
        props.put("mail.smtp.port", d_port);
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        //props.put("mail.smtp.debug", "true");
        props.put("mail.smtp.socketFactory.port", d_port);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
        try {
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(props, auth);     
            MimeMessage msg = new MimeMessage(session);
            msg.setContent(m_text, "text/html; charset=utf-8");

            msg.setSubject(m_subject);
            msg.setFrom(new InternetAddress(d_email));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));
            Transport.send(msg);
        } catch (Exception mex) {
            mex.printStackTrace();
            JOptionPane.showMessageDialog(null,mex);
        }
    }
   
 
  
    private class SMTPAuthenticator extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(d_email, d_password);
        }
    }
}