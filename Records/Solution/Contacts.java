
/**
 * Contacts is modelling a collection of people's information.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class Contacts {
    private List<President> people;

    public Contacts() {
        people = new ArrayList<President>();

        try {
            addFromFile("people.txt");
        } catch (IOException e) {
            System.out.println("Error reading Contacts from file.");
        }
    }

    /**
     * President with given name, number, and email are added to list and list is
     * sorted.
     *
     * @param name   - name of President to be added
     * @param number - phone number of President to be added
     * @param email  - email of President to be added
     */
    public void addPresident(String name, String number, String email) {
        if(email.length() == 0) {
            people.add(new President(name, number));
        }
        else {
            people.add(new President(name, number, email));
        }
        sortContacts();
    }

    /**
     * Reads lines from file to add to list.
     *
     * @param file - name of file to be read
     */
    private void addFromFile(String file) throws IOException {
        Scanner inFile = new Scanner(new File(file));

        while (inFile.hasNext()) {
            String line = inFile.nextLine();
            people.add(new President(grabName(line), grabNum(line), grabEmail(line)));
        }

        inFile.close();

        sortContacts();
    }

    /**
     * @param line - Info in the form "name, number, email"
     * @return the name from the line (value before first comma) and null if nothing
     *         is found
     */
    public String grabName(String line) {
        int i = line.indexOf(",");
        if (i == -1) {
            return null;
        }
        return line.substring(0, i);
    }

    /**
     * @param line - Info in the form "name, number, email"
     * @return the phone number from the line (value between commas) and null if
     *         nothing is found
     */
    public String grabNum(String line) {
        int i = line.indexOf(",");
        if (i == -1) {
            return null;
        }
        int j = line.indexOf(",", i + 1);
        if (j == -1) {
            return null;
        }
        return line.substring(i + 2, j);
    }

    /**
     * @param line - Info in the form "name, number, email"
     * @return the email from the line (value after second comma) and null if
     *         nothing is found
     */
    public String grabEmail(String line) {
        int i = line.indexOf(",");
        if (i == -1) {
            return null;
        }
        int j = line.indexOf(",", i + 1);
        if (j == -1) {
            return null;
        }
        return line.substring(j + 2);
    }

    /**
     * @param name - the name of the President to be found
     * @return President in the list with the name given using binary search and null
     *         if not found
     */
    public President getContact(String name) {
        int low = 0;
        int high = people.size() - 1;

        while(high >= low) {
            int mid = (low + high) / 2;

            if(name.compareTo(people.get(mid).name()) < 0) {
                high = mid - 1;
            }

            else if(name.equals(people.get(mid).name())) {
                return people.get(mid);
            }

            else {
                low = mid + 1;
            }
        }

        return null;
    }

    /**
     * people is sorted in ascending order using insertion sort
     */
    public void sortContacts() {
        President temp;

        for (int i = 1; i < people.size(); i++) {
            for(int j = i; j > 0; j--) {
                if(people.get(j).name().compareTo(people.get(j-1).name()) < 0) {
                    temp = people.get(j);
                    people.set(j, people.get(j-1));
                    people.set(j-1, temp);
                }
            }
        }
    }

    @Override
    public String toString() {
        String list = "";

        for (President p : people) {
            list += p.name() + ", " + p.number() + ", " + p.email() + "\n";
        }

        return list;
    }
}
