import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class NameTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class NameTest
{
    /**
     * Default constructor for test class NameTest
     */
    public NameTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAllConstructor()
    {
        Name name1 = new Name("pritesh", "bhole", "5", "gowland", "newcastle", "NE4 4NE");
        assertNotNull(name1);
    }
    
    @Test
    public void testGetFirstNameMethod()
    {
        Name name1 = new Name("pritesh", "bhole", "5", "gowland", "newcastle", "NE4 9NE");
        assertTrue(name1.getFName()== "pritesh");
    }

    @Test
    public void testGetLastNameMethod()
    {
        Name name1 = new Name("pritesh", "bhole", "5", "gowland", "newcastle", "NE4 9NE");
        assertTrue(name1.getLName()== "bhole");
    }

    @Test
    public void testGetNameMethod()
    {
        Name name1 = new Name("pritesh", "bhole", "5", "gowland", "newcastle", "NE4 9NE");
        assertEquals("priteshbhole", name1.getName());
    }
}







