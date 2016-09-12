import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

/**
 * Provides a text based user interface for the AddressBook project.
 * 
 * @author Pritesh Bhole
 * @version 15/03/2015
 */


public class AddressBookTextUI 
{
public AddressBook addressBook;
Scanner myScanner;
/**
 * Constructor for objects of class TextUI
 */
    
public AddressBookTextUI()
{
    addressBook = new AddressBook();
    myScanner = new Scanner(System.in);
}

/**
 * provides the main user interface with the program
 */
    
public void menu()
{
    String command;
    do
    {
       displayMenu();
       command = getCommand();
       execute(command);
    }
    while (!command.equals("Quit"));
}
    
/**
* displays the menu string on the terminal display
*/
   
public void displayMenu()
{
     String menuString = "\n Your Choices are :\n";
     menuString += "Display full details of person    [Full]\n";
     menuString += "Add a Person                      [Add]\n";
     menuString += "Remove a person                   [Remove]\n";
     menuString += "Find Person by name               [Find]\n";
     menuString += "Quit                              [Quit]\n";
     menuString += "Enter Choice : ";
     System.out.print(menuString);
}

/**
*  obtains the user's command
*  one command per line
*  @return the user command
*/

public String getCommand()
{
     return myScanner.nextLine();
}

/**
* processes the legal commands
* @param command the command entered by the user
*/

public void execute(String command)
{
    if (command.equals("Quit"))
        quitCommand();
    else
    if (command.equals("Full"))
        fullCommand();
    else
    if (command.equals("Find"))
        findCommand();
    else
    if (command.equals("Remove"))
        removeCommand();
    else
    if (command.equals("Add"))
        addCommand();
    else
    if (command.equals("Remove"))
        removeCommand();
    else
        unknowCommand(command);
}
    
/**
* processes the quit command
* @param Quit exit the program
*/

public void quitCommand()
{
    System.out.println("Bye");
}
    
/**
* processes the Full Command to display all details of all persons in address Book
* @param full displays all details of persons
*/

public void fullCommand()
{
    System.out.println(addressBook.getAddressBook());
}

/**
* processes person search in address book
* @param find search with person full name
*/

public void findCommand()
{
    System.out.print("To Find Enter person full Name without Space : ");
    String listName = myScanner.nextLine();
    Name myName = addressBook.showName(listName);
    if (myName == null)
    {
        System.out.println("Person with name " + listName + " not  found");
    }
    else
    {
        System.out.println("\n"+myName.getNameData());
    }
}
    
/**
* processes request of user to remove a person from address book
* @param remove removes the perosn from address boook
*/

public void removeCommand()
{     
     System.out.print("To Delet Enter person full Name without Space : ");
     String listName = myScanner.nextLine();
     if (addressBook.removeName(listName))
     {
         System.out.println("\nPerson with name " + listName + " removed from class list");
     }
     else
     {
         System.out.println("Person with name " + listName + " not  found");
     }
}
     
/**
* Return the First Name  of the person.
* @return listfName 
*/

public String firstName()
{
     System.out.print("Enter First name : ");
     String listFName = myScanner.nextLine();
     while(listFName.length()==0)//User cannot proceed till a value is entered.
     {
        System.out.println("please enter First Name");
        listFName= myScanner.nextLine();
     }
     return listFName;
}

/**
* Return the Last Name  of the person.
* @return listlName 
*/

public String lastName()
{
     System.out.print("Enter Last name : ");
     String listLName = myScanner.nextLine();
     while(listLName.length()==0)//User cannot proceed till a value is entered.
     {
         System.out.println("please enter Last Name");
         listLName= myScanner.nextLine();
     }
     return listLName;
}

/**
* Return the street number of the person address.
* @return sNumber
*/

public String stNumber()
{
     System.out.print("Enter Street Number : ");
     String sNumber = myScanner.nextLine();
     while(sNumber.length()==0)//User cannot proceed till a value is entered.
     {
         System.out.println("please enter Street Number");
         sNumber = myScanner.nextLine();
     }
     return sNumber;
}

/**
* Return the street name of the person address.
* @return sName
*/

public String stName()
{
     System.out.print("Enter Street Name : ");
     String sName = myScanner.nextLine();
     while(sName.length()==0)//User cannot proceed till a value is entered.
     {
         System.out.println("please enter Street Name");
         sName = myScanner.nextLine();
     }
     return sName;
}
 
/**
* Return the city name of the person address.
* @return cName
*/

public String ctName()
{
     System.out.print("Enter City Name : ");
     String cName = myScanner.nextLine();
     while(cName.length()==0)//User cannot proceed till a value is entered.
     {
          System.out.println("please enter City Name");
          cName = myScanner.nextLine();
     }
     return cName;
}

/**
* Return the zip Code  of the person address after checking validity.
* @return zCode 
*/

public String zpCode()
{
   System.out.print("Enter zip Code in UK format : ");
   String zCode = myScanner.nextLine();
   while (zCode.length()==0)//User cannot proceed till a value is entered.
   {
       System.out.println("please enter a Zip Code in UK Format");
       zCode = myScanner.nextLine();
   }
     
   while(!zCode.matches("^[A-Z]{1,2}[0-9R][0-9A-Z]? [0-9][ABD-HJLNP-UW-Z]{2}$"))//User cannot proceed till Zip Code is in UK format.
   {
       System.out.println("please enter Zip Code in UK format ");
       zCode = myScanner.nextLine();
   }
   return zCode;
}

/**
* Return the person details
* @return name1 if a perosn is added
* @return null if a perosn in not added
*/

public Name add()
{
     System.out.println("\nAll Fields Are Mandatory....\n");
     String PersonFName=firstName();
     String PersonLName=lastName();
     if(addressBook.matchName(PersonFName,PersonLName)) //to check uniqueness of person in address book in term of name.
     {
         System.out.println("\nPERSON WITH\t"+PersonFName+"\t "+PersonLName+ "\tNAME ALREADY PRESENT..\nPLEASE TRY AGAIN..\nTHANK YOU..");
         return null;
     }
     else
     {
         String StreetNumber=stNumber();      
         String StreetName=stName();
         String CityName=ctName();
         String ZipCode=zpCode();
         Name name1=new Name(PersonFName, PersonLName, StreetNumber, StreetName,CityName, ZipCode);
         return name1;
     }
}

/**
* adds a perosn and details to address book
* @param add adds perosn to address book
*/

public void addCommand()
{   
    Name name2=add();
    if(name2!=null)
    {
       addressBook.enrollName(name2);
       System.out.println("\n\t PERSON ADDED \t");
    }
    else
    {
       System.out.println("\n\t PERSON NOT ADDED \t");      
    }
}
    
/**
* used in testAddressBook class to check remove and add method.
* @param listfName first name of person
* @param listlName last name of person
* @return true if person is matched otherwise false
*/

public boolean isIn (String personFName, String personLName)
{
     boolean found = true;
     if (addressBook.matchName(personFName, personLName))
     {
         return found;
     }
     else
     {
         return false;
     }
}

/**
* Shows invalid command if user enters a unknow command
* @param unknowCommand display invalid Command
*/
    
public void unknowCommand(String command)
{
   System.out.println("Invalid Command : "+ command);
}
}
