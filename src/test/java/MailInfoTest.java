import ua.edu.ucu.apps.task2.BirthdayMailCode;
import ua.edu.ucu.apps.task2.Client;
import ua.edu.ucu.apps.task2.MailInfo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MailInfoTest {

    @Test
    void testMailInfoGenerate() {
        Client client = Client.builder().name("Alice").age(30).sex("Female").email("alice@example.com").build();
        BirthdayMailCode mailCode = new BirthdayMailCode();
        MailInfo mailInfo = new MailInfo(client, mailCode);

        String generatedMessage = mailInfo.generate();

        assertEquals("Dear Alice! Happy 30 birthday!", generatedMessage);
    }
}