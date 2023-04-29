//*********************************
//Jadi Miller
//Data Structures
//1/30/2023
//*********************************
//Program asks user for username and password and compares it to the correct answers to determine
//if the user has typed in the matching username, password, or both.
//*********************************
import javax.swing.JOptionPane;
public class Login {
    public static void main(String[] args) {
        String username;
        String password;

        username = new String(JOptionPane.showInputDialog("Type in username: "));
        password = new String(JOptionPane.showInputDialog("Type in password: "));

        String usernameCorrect = "duckpods";
        String passwordCorrect = "123";
        System.out.println(username);

        if (username.equals(usernameCorrect))
            if (password.equals(passwordCorrect))
                System.out.println("Welcome to CS121!");
            else 
                System.out.println("That is the wrong password.");
        if (!username.equals(usernameCorrect))
            if (password.equals(passwordCorrect))
                System.out.println("That is the wrong username.");
            else
                System.out.println("That is the wrong username and password.");



    }
}
