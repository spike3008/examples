package junit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class AllAssertions {

    @Test
    @Ignore
    public void examples() throws Exception {
        // Fails a test with no message.
        Assert.fail();

        // Fails a test with the given message.
        Assert.fail("message");

        // Asserts that two int arrays are equal.
        Assert.assertArrayEquals(new int[]{0}, new int[]{0});

        // Asserts that two objects are equal.
        Assert.assertEquals("Ala", "Ala");

        // Asserts that two objects are not equals.
        Assert.assertNotEquals("Ala", "kot");

        // Asserts that a condition is true.
        Assert.assertTrue(1 == 1);

        // Asserts that a condition is false.
        Assert.assertFalse(1 == 2);

        // Asserts that an object is null.
        Assert.assertNull(null);

        // Asserts that an object isn't null.
        Assert.assertNotNull(new Object());

        Object o1 = new Object();
        Object o2 = new Object();

        // Asserts that two objects refer to the same object.
        Assert.assertSame(o1, o1);

        // Asserts that two objects do not refer to the same object.
        Assert.assertNotSame(o1, o2);
    }
}
