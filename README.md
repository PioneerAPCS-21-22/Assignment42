# Assignment 42

Run the code in the debug folder. You'll notice the chatbot is a little broken. Follow the steps below to fix it by using a debugger.

## Debug

1. The chatbot starts by saying `null` instead of the proper greeting. Set a breakpoint at line 10 in `Main` and step into the constructor to see what's happening. Look at what happens to the instance variable.
1. When the chatbot chooses a random response, it will never choose "Hmmm." and sometimes won't say anything. Set a breakpoint at line 51 in `Chatbot` and step into the `getRandomResponse()` function. You may have to run through a few times since there are random numbers involved.
1. The chatbot is supposed to have some specific responses when it detects certain keywords and phrases, but it always chooses a random response. Set a breakpoint at line 37 in `Chatbot` to see why it isn't responding to phrases with "cat" and "dog".

### Submission

Submit a comment on Canvas assignment explaining how you fixed the issues.

## Record

Download the code (three .java files and a .txt file). It should run without any issues. Then make the following changes:

1. Convert the `President` class to a record. This should eliminate a lot of the code. 
1. After changing it to a record, the ide/compiler should tell you that you have some errors in the `Contacts` class. Fix them and make sure the program runs properly just like it did before. 
1. Lastly, download the new starter code (`President.java`) and make the following additions to the `President` record:
    1. Add a constructor that only takes a name and number, but initializes all three instance variables. Then, edit the `addPresident()` method in the `Contacts` class so that it uses this new constructor if the email is empty.
    1. Add an instance method that checks if a `President`'s first name is the same as another `President`'s first name.
1. Test the code by adding a new `President` without giving a phone number and compare to `President`'s to see if they have the same first name.

### Submission

Submit your `President.java` and `Contacts.java` files on Canvas.
