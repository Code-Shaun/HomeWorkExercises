package maven.project;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by student on 2016/02/29.
 */
public class TestProgram
{
    private Tester tester;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Program started");
    }

    @Test
    public void testFloatingPoint() throws Exception
    {
        tester = new Tester();
        double a = 3.215;
        //double b = 3.219;
        double b = 3.215;
        double result = tester.testFloatingPoint(a, b);

        Assert.assertEquals(a, result, 0.001);
    }

    @Test
    public void testIntegers() throws Exception
    {
        tester = new Tester();
        int result = tester.addNumbers(3,2);

        Assert.assertEquals(5, result);
    }

    @Test
    public void testObjectEquality() throws Exception
    {
        tester = new Tester();
        TestObject a = new TestObject("Bob", 45);
        //TestObject2 b = new TestObject2("eng663", 9500.00);
        TestObject b = a;
        b.setName("Ryan");
        b.setAge(55);

        Object result = tester.compareEquality(a, b);

        Assert.assertEquals(a, result);
    }

    @Test
    public void testObjectIdentity() throws Exception
    {
        tester = new Tester();
        TestObject o1 = new TestObject("Bob", 45);
        //estObject2 o2 = new TestObject2("Bob", "eng663", 9500.00);
        Object o2 = o1;
        o1.setAge(50);

        Object result = tester.compareObjects(o1, o2);

        Assert.assertSame(o1, result);
    }



    @Test
    public void testAssertTrue() throws Exception
    {
        tester = new Tester();
        int x = 13;
        int y = 12;

        boolean result = tester.isGreater(x, y);

        Assert.assertTrue("x is not greater than y", result);
    }

    @Test
    public void testAssertFalse() throws Exception
    {
        tester = new Tester();
        int max = 999;
        int value = 100;

        boolean result = tester.isOutOfRange(max, value);

        Assert.assertFalse(result);
    }

    @Test
    public void testAssertNull() throws Exception
    {
        tester = new Tester();
        Object o = null;

        Object result = tester.isNull(o);

        Assert.assertNull("Assertion is not null", result);
    }

    @Test
    public void testAssertNotNull() throws Exception
    {
        tester = new Tester();
        Object o = 123;

        Object result = tester.isNotNull(o);

        Assert.assertNotNull("Assertion is null", result);
    }

    @Test
    public void testFail() throws Exception
    {
        int result = 0;
        try
        {
            tester = new Tester();
            //int index = 4;
            int index = 2;
            int numberArray[] = {1, 2, 3};
            result = tester.failMethod(index, numberArray);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            Assert.fail(); // cause the test to fail
        }
    }

    @Test(timeout = 100)
    public void testString() throws Exception
    {
        tester = new Tester();
        //int period = 200;
        int period = 98;
        tester.testTimeout(period);
    }

    @Ignore @Test
    public void testIgnore() throws Exception
    {
        tester = new Tester();
        tester.testIgnore();
    }

    @Test
    public void testArrayEquals()
    {
        tester = new Tester();
        int values[] = {90, 65, 70};
        //int expected[] = {90, 65, 75};
        int expected[] = {90, 65, 70};
        int result[] = tester.testArrayEquals(values);

        Assert.assertArrayEquals(expected, result);
    }

}
