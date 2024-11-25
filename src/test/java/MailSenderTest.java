import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ua.edu.ucu.apps.task2.MailInfo;
import ua.edu.ucu.apps.task2.MailSender;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class MailSenderTest {
    @Test
    void testMailSender() {
        MailInfo mailInfo = Mockito.mock(MailInfo.class);
        when(mailInfo.generate()).thenReturn("test email");
        MailSender mailSender = new MailSender();
        try {
            mailSender.sendMail(mailInfo);
        } catch (Exception e) {
            fail("expected no exception for sending");
        }

        verify(mailInfo, times(1)).generate();
    }
}