import java.util.*;

/**
 * The AddressBook class represents an method  for Enrollment,remove, show address for person. 
 * Modified to have ArrayList of list also has an infinite capacity
 * @author Pritesh Bhole
 * @version 15/03/2015
 */

public class AddressBook
{
private ArrayList < Name > lists;//creating an array list.
/**
 * Create a AddressBook with  no limit on number of enrolments. 
 */

public AddressBook()
{
   lists = new ArrayList < Name >();//initializing an array list.
}

/**
 * Add a person details  to this AddressBook like first and last name.
 * Along with address details like city name, street name, street number, zip code
 * @param newName the list object to be add
 */

public void enrollName(Name newName)
{
    lists.add(newName);//invoke method to add  person details.
}

/**
* Return the number of details currently enrolled in this AddressBook.
* @return the size of the class
*/
public int numberOfNames()
{
    return lists.size();//invoke method to get no of names in list.
}

/**
* Determines whether the array list is empty.
*
* @return true if the list is empty false otherwise.
*/
public boolean isEmpty()
{
    return (lists.size() == 0);
}

/**
* Provides a class list with other AddressBook details. 
* @return the class details
*/
 
public String getAddressBook()
{
    String myString="---------------------------------------------"+"\nTotal number of entries in address book :"+numberOfNames();
    if (numberOfNames() > 0 )//Continues only if a entry is present.
    {
      for (Name list : lists)
      {
                System.out.println("Persons Details \n\n"+list.getNameData() + "\n");//invokes getNameData method.
      }
    }
    return myString;
}

/**
* searches for a person by name.
* @param listName name of person
* @return a list if found otherwise null
*/

public Name showName(String listName)
{
    for (Name list : lists)
    {
       if (listName.equals(list.getName()))//compare user entered name with list names.
       {
          return list;
       }
    }
    return null;
}

/**
* removes a person from the list.
* @param listName The name of the person to be deleted
* @return true if person is deleted otherwise false
*/

public boolean removeName(String listName)
{
    int index = 0;
    for (Name list : lists)
    {
        if (listName.equals(list.getName()))//compare user entered name with list names.
        {
            lists.remove(index);//method to remove person if name matched.
            return true;
        }
        index++;
    }
    return false;
}
    
/**
* to match a user persons entery with already existing persons in the list.
* @param listfName first name of person
* @param listlName last name of person
* @return true if person is matched otherwise false
*/

public boolean matchName(String listFName,String listLName)
{
    for (Name list : lists)
    {
       if (listFName.equals(list.getFName())&&(listLName.equals(list.getLName())))//compare user entered name with list names.
       {
          return true;
       }
    }
    return false;
}
}
