/**
 * Write a description of class President here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class President
{
    private String name;
    private String number;
    private String email;

    public President(String name, String number, String email)
    {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    /**
     * @return name of this President.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return number of this President.
     */
    public String getNumber()
    {
        return number;
    }

    /**
     * @return email of this President.
     */
    public String getEmail()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return (name + "\nNumber: " + getNumber() + "\nEmail: " + getEmail());
    }
}
