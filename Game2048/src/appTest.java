import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

public class appTest {

    @Before
    public void setup() {

    }

    @Test
    public void test() {

    }

    @Test

    public void testMin3() {
        int a = Integer.MAX_VALUE;
        assertEquals(5, app.min3(8));
        assertEquals(0, app.min3(3));
        assertNotEquals(5, app.min3(10));
        assertEquals(511, app.min3(514));
        assertEquals(5, app.min3(a));
    }
}
