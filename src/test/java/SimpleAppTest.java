import org.example.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleAppTest {
    @Test
    void testAdd() {
        App app = new App();
        assertEquals(5, app.add(2, 3));
    }
}