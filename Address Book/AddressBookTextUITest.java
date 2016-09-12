

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AddressBookTextUITest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AddressBookTextUITest
{
   /**
    * Default constructor for test class AddressBookTextUITest
    */
   public AddressBookTextUITest()
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
   public void testRemoveMethod()
   {
      AddressBookTextUI addressB1 = new AddressBookTextUI();
      addressB1.addCommand();
      assertEquals(true,addressB1.isIn("pritesh","bhole"));
      addressB1.removeCommand();
      assertEquals(false,addressB1.isIn("pritesh","bhole"));
   }

   @Test
   public void testAddMethod()
   {
      AddressBookTextUI addressB1 = new AddressBookTextUI();
      assertEquals(false,addressB1.isIn("pritesh","bhole"));
      addressB1.addCommand();
      assertEquals(true,addressB1.isIn("pritesh","bhole"));
   }
}

