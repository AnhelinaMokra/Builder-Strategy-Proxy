package ua.edu.ucu.apps.task2;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

@Getter
public class MailBox {

    private List<MailInfo> infos;
    private MailSender mailSender;

    public MailBox(MailSender mailSender) {
        this.infos = new ArrayList<>();
        this.mailSender = mailSender;
    }

    public void addMailInfo(MailInfo mail) {
        infos.add(mail);
    }

    public void sendAll() {
        for(MailInfo mail: infos) {
            mailSender.sendMail(mail);
        }
    }
}