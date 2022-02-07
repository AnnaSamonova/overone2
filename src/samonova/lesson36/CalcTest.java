package samonova.lesson36;


import jdk.jfr.StackTrace;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testAdd() {
        int result = Calc.add(2, 1);
        assertEquals(3, result);

    }

    @Test
    public void testSub() {
        int result = Calc.sub(2, 1);
        assertEquals(1, result);

    }

    @Test
    public void testMul() {
        int result = Calc.mul(2, 1);
        assertEquals(2, result);

    }

    @Test
    public void testDiv() {
        int result = Calc.div(2, 1);
        assertEquals(2, result);

    }

    @Test
    public void testText() {
        String result = Calc.text("2222");
        assertEquals("123456789", result);
    }
}