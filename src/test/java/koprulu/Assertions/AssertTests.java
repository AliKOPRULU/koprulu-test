package koprulu.Assertions;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ali on 25.11.2016.
 * http://junit.org/junit4/
 * https://github.com/junit-team/junit4/wiki/Assertions
 */

public class AssertTests {
    @Test
    public void testAssertArrayEquals() {//assert -iddiada bulunmak -savunmak
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        assertArrayEquals("failure- byte arrays not some", expected, actual);
    }

    @Test
    public void testAssertEquals() {
        assertEquals("failure - strings are not equal", "text", "text");
    }


}
