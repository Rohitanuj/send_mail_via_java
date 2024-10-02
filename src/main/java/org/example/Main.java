package org.example;

import javax.mail.MessagingException;

public class Main {
    public static void main(String[] args) {
     System.out.println("----strating to send mail----");
MailHandler mailhandler=new MailHandler();

        try {
            mailhandler.sendMail();
        } catch (MessagingException e) {
            System.out.println("here we are ");
        }
    }
}