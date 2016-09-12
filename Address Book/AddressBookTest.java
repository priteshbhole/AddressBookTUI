import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AddressBookTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AddressBookTest
{
    /**
     * Default constructor for test class AddressBookTest
     */
    public AddressBookTest()
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
    public void testForFindMethod()
    {
        AddressBook addressB1 = new AddressBook();
        addressB1.enrollName(new Name("pritesh", "bhole", "5", "gowland", "newcastle", "NE4 4NE"));
        AddressBook addressB2 = new AddressBook();
        assertEquals(true, addressB1.matchName("pritesh", "bhole"));
        assertEquals(false, addressB1.matchName("james", "pitt"));
    }

    @Test
    public void testArrayListIsCreated()
    {
        AddressBook addressB2 = new AddressBook();
        addressB2.enrollName( new Name("pritesh", "bhole", "5", "gowland", "newcastle", "NE4 9NE"));
        assertNotNull(addressB2);
    }

    @Test
    public void testIfArrayListIsEmpty()
    {
        AddressBook addressB1 = new AddressBook();
        assertTrue(addressB1.isEmpty());
    }
}




