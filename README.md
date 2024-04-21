# Sending Email on Spring-boot

**Description:** This is a simple send email built using Spring Boot framework. It provides Google SMTP mail sender with using JavaMailSender interface and SimpleMailMessage class.
- **Spring Boot Starter Mail**
- **Google SMTP**

## Requirements :
- Java 17 or higher
- Maven

## Getting Started:
git clone https://github.com/omerfarukkodat/spring-mail-send.git

- You have to modify sender e-mail adress and receiver e-mail adress HomeService and SpringBootMailSendApplication Class.


Configure Database:
Open application.properties file in src/main/resources directory.
Update the :
- spring.mail.username=sender e-mail adress
- spring.mail.password=you have to write your Google app's password
- Build and Run:
mvn spring-boot:run

