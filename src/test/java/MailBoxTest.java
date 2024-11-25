import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ua.edu.ucu.apps.task2.BirthdayMailCode;
import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.MailBox;
import ua.edu.ucu.apps.task2.MailInfo;
import ua.edu.ucu.apps.task2.MailSender;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MailBoxTest {

    @Test
    void testMailBox() {
        MailSender mockSender = Mockito.mock(MailSender.class);
        MailBox mailBox = new MailBox(mockSender);

        Client client1 = Client.builder().name("John").age(25).sex("Male").email("john@example.com").build();
        MailInfo mail1 = new MailInfo(client1, new BirthdayMailCode());

        Client client2 = Client.builder().name("Alice").age(30).sex("Female").email("alice@example.com").build();
        MailInfo mail2 = new MailInfo(client2, new BirthdayMailCode());

        mailBox.addMailInfo(mail1);
        mailBox.addMailInfo(mail2);

        List<MailInfo> infos = mailBox.getInfos();
        assertEquals(2, infos.size());
        assertEquals(mail1, infos.get(0));
        assertEquals(mail2, infos.get(1));

        mailBox.sendAll();
        verify(mockSender, times(2)).sendMail(any(MailInfo.class));
    }
}