/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Contacts contacts = new Contacts();
        boolean run = true;
        Scanner in = new Scanner(System.in);

        while(run)
        {
            System.out.print("\n1: Find contact\n2: Add contact\n3: List contacts\n4: Compare first names ");
            int choice = Integer.parseInt(in.nextLine());

            while(choice < 1 || choice > 4)
            {
                System.out.print("Unknown command.\n1: Find contact\n2: Add contact\n3: List contacts ");
                choice = Integer.parseInt(in.nextLine());
            }

            if(choice == 1)
            {
                System.out.print("Enter the name: ");
                String name = in.nextLine();
                President p = contacts.getContact(name);

                if(p != null)
                {
                    System.out.println(p);
                }

                else
                {
                    System.out.println("President not found.");
                }
            }

            else if(choice == 2)
            {
                System.out.println("Enter name, then number, then email.");
                String name = in.nextLine();
                String number = in.nextLine();
                String email = in.nextLine();
                contacts.addPresident(name, number, email);
            }

            else if(choice == 3)
            {
                System.out.println(contacts);
            }

            else if(choice == 4)
            {
                System.out.print("Enter the first President's name: ");
                String name1 = in.nextLine();
                President p1 = contacts.getContact(name1);
                System.out.print("Enter the second President's name: ");
                String name2 = in.nextLine();
                President p2 = contacts.getContact(name2);

                if(p1 != null && p2 != null)
                {
                    if(p1.hasSameFirstName(p2)) {
                        System.out.println(p1.name() + " and " + p2.name() + " have the same first name.");
                    }
                    else {
                        System.out.println(p1.name() + " and " + p2.name() + " don't have the same first name.");
                    }
                }

                else
                {
                    System.out.println("President(s) not found.");
                }
            }

            System.out.print("\nEnter 0 to quit or 1 to complete another action. ");
            choice = Integer.parseInt(in.nextLine());

            while(choice != 0 && choice != 1)
            {
                System.out.print("Unknown command.\nEnter 0 to quit or 1 to complete another action. ");
                choice = Integer.parseInt(in.nextLine());
            }

            if(choice == 0)
            {
                System.out.println("Goodbye!");
                run = false;
            }
        }

        in.close();
    }
}
