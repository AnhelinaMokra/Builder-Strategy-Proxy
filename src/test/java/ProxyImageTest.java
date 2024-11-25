import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import ua.edu.ucu.apps.task3.ProxyImage;
import ua.edu.ucu.apps.task3.RealImage;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.*;

public class ProxyImageTest {

    @Test
    void testDisplay() {
        RealImage mockRealImage = Mockito.mock(RealImage.class);
        ProxyImage proxyImage = spy(new ProxyImage("test-image.jpg"));
        proxyImage.realImage = mockRealImage;
        proxyImage.display();
        verify(mockRealImage, times(1)).display();
    }

    @Test
    void testLazyLoading() {
        ProxyImage proxyImage = new ProxyImage("test-image.jpg");
        assertNull(proxyImage.realImage);
        proxyImage.display();
        assertNotNull(proxyImage.realImage);
    }
}