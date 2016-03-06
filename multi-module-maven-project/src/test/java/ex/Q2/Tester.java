package ex.Q2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by shaun on 2016/03/05.
 */
public class Tester
{
    private Main main;
    private MainScreen mainScreen;
    private Process process;
    private Protocols protocol;

    @Before
    public void setUp() throws Exception
    {

    }

    @Test
    public void testValidateUserID() throws Exception
    {
        main = new Main();
        boolean result =  main.validateIdUser("Bob12345");

        Assert.assertTrue(result);
    }

    @Test
    public void testValidPassword() throws Exception
    {
        mainScreen = new MainScreen();
        String expected = "P@ssword123";
        String result =  mainScreen.retrievePassword();

        Assert.assertEquals("Invalid password", expected, result);
    }

    @Test (timeout = 100)
    public void testProcessTime() throws Exception
    {
        process = new Process();
        process.processTime(90);
    }

    @Test
    public void testProtocol() throws Exception
    {
        protocol = new Protocols();
        String expected = "HTTP";
        String result =  protocol.retrieveProtocol();

        Assert.assertEquals("Invalid protocol", expected, result);
    }

}