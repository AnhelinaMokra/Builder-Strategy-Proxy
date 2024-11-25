import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.task2.Client;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    void testClientUniqueIdGeneration() {
        Client client1 = Client.builder().name("John").age(25).sex("Male").email("john@example.com").build();
        Client client2 = Client.builder().name("Alice").age(30).sex("Female").email("alice@example.com").build();

        assertEquals(0, client1.getId());
        assertEquals(1, client2.getId());
    }
}