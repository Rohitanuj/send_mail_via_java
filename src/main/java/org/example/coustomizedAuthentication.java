package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class coustomizedAuthentication extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(MailMetadata.myuserMail,MailMetadata.password);
    }
}
