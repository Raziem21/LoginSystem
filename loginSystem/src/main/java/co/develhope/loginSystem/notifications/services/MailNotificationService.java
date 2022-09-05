package co.develhope.loginSystem.notifications.services;

import co.develhope.loginSystem.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailNotificationService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendActivationMail(User user) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(user.getEmail());
        sms.setFrom("rodolfo.valentini99@gmail.com");
        sms.setReplyTo("rodolfo.valentini99@gmail.com");
        sms.setSubject("Ti sei iscritto alla piattaforma");
        sms.setText("Il codice di attivazione è: " + user.getActivationCode());
        emailSender.send(sms);
    }

    public void sendPasswordResetMail(User user) {
        SimpleMailMessage sms = new SimpleMailMessage();
        sms.setTo(user.getEmail());
        sms.setFrom("rodolfo.valentini99@gmail.com");
        sms.setReplyTo("rodolfo.valentini99@gmail.com");
        sms.setSubject("Ti sei iscritto alla piattaforma");
        sms.setText("Il codice di attivazione è: " + user.getPasswordResetCode());
        emailSender.send(sms);
    }
}
