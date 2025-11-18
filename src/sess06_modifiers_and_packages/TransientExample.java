package sess06_modifiers_and_packages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Java program to demonstrate the 'transient' keyword/modifier
 * to prevent the user's password from being serialised.
 * 
 * @author Window
 */
public class TransientExample
{
    // main method begins program execution
    public static void main(String[] args)
    {
        // create a user object
        User user1 = new User("j_kamau", "j.kamau@edulink.ac.ke", "SupersecretPa$sw0rd");
        
        // Display the details of the user before serialization
        System.out.println("The user's details before serialisation: \n" + user1);
        
        // serialise the user1 object to a file
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser")))
        {
            oos.writeObject(user1);
        }
        catch(IOException ioe)
        {
            System.out.println("The error: " + ioe.getLocalizedMessage() + "occured!");
        }
        
        // modify the object by changing the user's password
        user1.password = "n3wEas1erp@$s";
        
        // Deserialise the object from the file
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser")))
        {
            User deserialisedUser = (User) ois.readObject();
            
            // Display the details of the user after serialisation
            System.out.println("The user's details after serialisation: \n" + deserialisedUser);
        }
        catch (IOException | ClassNotFoundException e)
        {
            System.out.println("The error: " + e.getLocalizedMessage() + "occured!");
        }
    }
}

class User implements Serializable  
{
    // Regular fields, wil be serialised
    String usernsme, email;
    
    // Transient field, will Not be serialised
    transient String password;
    
    // Parametersed constructor
    public User(String username, String email, String password)
    {
        this.usernsme = username;
        this.email = email;
        this.password = password;
    }
    
    //Override the toString method
    @Override
    public String toString()
    {
        return "User Details"
                + "\n" + "-".repeat(50)
                + "\nUsername : " + this.usernsme
                + "\nEmail : " + this.email
                + "\nPassword : " + (this.password !=null? "******":"null")
                + "\n" + "-".repeat(50) ;
    }
    
}
