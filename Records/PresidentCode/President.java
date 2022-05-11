/**
 * Write a description of class President here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

record President(String name, String number, String email)
{

    /**
     * Constructor
     * @param name - the full name of this President
     * @param number - the 10 digit phone number of this President
     */ 






    /**
     * Checks if two Presidents have the same first name.
     * 
     * @param p - the President being compared to this President.
     * @return true if they have the same name, false otherwise. 
     */







    public static String createEmail(String name)
    {
        String firstLetter = name.substring(0, 1);
        int i = name.lastIndexOf(" ");
        String lastName = name.substring(i + 1);
        String email = firstLetter.toLowerCase() + lastName.toLowerCase() + "@whitehouse.gov";
        return email;
    }

    public String getFirstName() 
    {
        return name.substring(0, name.indexOf(" "));
    }
}
