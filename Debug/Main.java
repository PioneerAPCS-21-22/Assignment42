import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        // Create a Chatbot object
        Chatbot2 bot = new Chatbot2();

        // Print greeting
        System.out.println(bot.getGreeting());
        
        // User input
        String statement = in.nextLine();

        // Keep talking until user says "Bye", but change it so that it isn't case sensitive.
        while (!statement.equalsIgnoreCase("Bye"))
        {
            // Print response from chatbot
            System.out.println(bot.getResponse(statement));

            // Get inuput from the user again.
            statement = in.nextLine();
        }
    }
}
