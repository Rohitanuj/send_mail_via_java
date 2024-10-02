package org.example;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandler {

    void sendMail() throws MessagingException {

        Properties sysProperties =System.getProperties();


        System.out.println(sysProperties);

        sysProperties.put("mail.smtp.host",MailMetadata.hostServer);
        sysProperties.put("mail.smtp.port",MailMetadata.port);
        sysProperties.put(MailMetadata.sslproperty,"true");
        sysProperties.put(MailMetadata.authPath,"true");


        Authenticator mailAuthenticator= new coustomizedAuthentication();
        Session mailSession=Session.getInstance(sysProperties,mailAuthenticator);

        MimeMessage mailmessage=new MimeMessage(mailSession);

try {
    mailmessage.setFrom(MailMetadata.myuserMail);
    mailmessage.setSubject("This is the message");
    mailmessage.setText("I m Rohit here ");

    Address receiverEmail = new InternetAddress(MailMetadata.receiverMail);
    mailmessage.setRecipient(Message.RecipientType.TO, receiverEmail);
    Transport.send(mailmessage);
} catch (MessagingException e) {
   System.out.println("Can not");
}
    }
}
