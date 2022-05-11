/**
 * Write a description of class President here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

record President(String name, String number, String email)
{
    public President(String name, String number) 
    {
        this(name, number, createEmail(name)); 
    }

    public static String createEmail(String name)
    {
        String firstLetter = name.substring(0, 1);
        int i = name.lastIndexOf(" ");
        String lastName = name.substring(i + 1);
        String email = firstLetter.toLowerCase() + lastName.toLowerCase() + "@whitehouse.gov";
        return email;
    }

    public boolean hasSameFirstName(President p) 
    {
        return this.getFirstName().equals(p.getFirstName());
    }

    public String getFirstName() 
    {
        return name.substring(0, name.indexOf(" "));
    }
}
