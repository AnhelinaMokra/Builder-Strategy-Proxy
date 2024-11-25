import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task2.BirthdayMailCode;
import ua.edu.ucu.apps.task2.Client;

import static org.junit.jupiter.api.Assertions.*;

public class BirthdayMailCodeTest {

    @Test
    void testBirthdayMailCode() {
        Client client = Client.builder().name("John").age(25).sex("Male").email("john@example.com").build();
        BirthdayMailCode mailCode = new BirthdayMailCode();

        String generatedMessage = mailCode.generate(client);

        assertEquals("Dear John! Happy 25 birthday!", generatedMessage);
    }
}