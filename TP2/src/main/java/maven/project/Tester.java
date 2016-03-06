package maven.project;

/**
 * Created by student on 2016/02/29.
 */
public class Tester
{
    public double testFloatingPoint(double a, double b)
    {
        return b;
    }

    public int addNumbers(int a, int b)
    {
        return a + b;
    }

    public Object compareObjects(Object o1, Object o2)
    {
        Object result = o2;
        return result;
    }

    public Object compareEquality(Object a, Object b)
    {
        return b;
    }

    public boolean isGreater(int x, int y)
    {
        return x > y;
    }

    public boolean isOutOfRange(int max, int value)
    {
        return (value > max);
    }

    public Object isNull(Object o)
    {
        return o;
    }

    public Object isNotNull(Object o)
    {
        return o;
    }

    public boolean compareStrings(String s1, String s2)
    {
        return s1.equals(s2);
    }

    public int failMethod(int index, int arr[])
    {
        int number = 0;
        try
        {
            number = arr[index];
        } catch (ArrayIndexOutOfBoundsException e)
        {
            throw e;
        }
        return number;
    }

    public void testTimeout(int period) throws InterruptedException
    {
        Thread.sleep(period);
    }

    public void testIgnore()
    {
        System.out.println("Test not ignored");
    }

    public int[] testArrayEquals(int[] grades)
    {
        int result[] = new int[grades.length];
        for (int i = 0; i < grades.length; i++)
        {
            result[i] = grades[i];
        }
        return result;
    }
}
