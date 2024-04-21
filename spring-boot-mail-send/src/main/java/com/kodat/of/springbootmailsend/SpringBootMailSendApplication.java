package com.kodat.of.springbootmailsend;

import com.kodat.of.springbootmailsend.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootMailSendApplication {
   
    private final HomeService homeService;

    public SpringBootMailSendApplication(HomeService homeService) {
        this.homeService = homeService;
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringBootMailSendApplication.class, args);
    }


    @EventListener(ApplicationReadyEvent.class)
    public void triggerMail(){
        homeService.sendSimpleMail("receiver e-mail adress",
                "This is test body of mail",
                "This is test subject of mail");
    }

}

