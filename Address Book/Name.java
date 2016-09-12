/**
 * The Name class represents persons details in system.
 * It holds the persons details relevant in our context.
 * Modified to show MVC features
 * @author Pritesh Bhole
 * @version 15/03/2015
 */
public class Name
{
private String fName;//persons first name
private String lName;//persons last name
private String streetNumber;//street number of person address
private String streetName;//street name of person address
private String cityName;//city name of person
private String zipCode;//zip code of person address
/**
* Create a new name with a given name
* @param firstName the person fname
* @param lastName the person lname
* @param stNumber the person streetNumber
* @param stName the person  streetName
* @param ctName the person  cityName
* @param zpCode the person  zipCode
*/

public Name(String firstName,String lastName,String stNumber,String stName,String ctName,String zpCode)
{
    fName = firstName;
    lName=lastName;
    streetNumber = stNumber;
    streetName = stName;
    cityName = ctName;
    zipCode = zpCode;
}

/**
* Return the first name of person.
* @return the person first name
*/

public String getFName()
{
    return fName;
}
    
/**
* Return the last name of person.
* @return the person last name
*/

public String getLName()
{
     return lName;
}
   
/**
* Return the full name and all address details of this person at output terminal.
* @the persons first and last name.
* @the persons address details like city name, street name, street number, zip code
*/

public String getNameData()
{
    return "First name :"+fName+"\t Last Name :"+lName+"\n Street Number :"+streetNumber+"\n Street Name :"
    +streetName+"\n City Name :"+cityName+"\n Zip Code :"+zipCode;
}
    
/**
* @Return the full name of person
*/ 

public String getName()
{
    return fName+""+lName;
}
}