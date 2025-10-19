import org.example.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleAppTest {

    @Test
    void testAdd() {
        App app = new App();
        assertEquals(15, app.add(7, 8));
    }

    @Test
    void testSubtract() {
        App app = new App();
        assertEquals(4, app.subtract(10, 6));
    }

    @Test
    void testMultiply() {
        App app = new App();
        assertEquals(42, app.multiply(6, 7));
    }
}
