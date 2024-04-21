package com.kodat.of.springbootmailsend.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public final JavaMailSender javaMailSender;

    public HomeService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendSimpleMail(String toMail , String body , String subject){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("sender e-mail adress");
        simpleMailMessage.setTo(toMail);
        simpleMailMessage.setText(body);
        simpleMailMessage.setSubject(subject);

        javaMailSender.send(simpleMailMessage);
        System.out.println("Simple message is sent to mail id : " + toMail);



    }


}
