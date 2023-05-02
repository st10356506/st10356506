import java.util.Scanner;
//import scanner to read keyboard input
public class Login {
    //declare neccessary variables
    static String username;
    private static String password;
    private static String firstName;
    private static String lastName;

    public static void main(String[] args) {
        registerUser();
        //method to execute the registerUser object
        loginUser();
        //method to execute the registerUser object
    }

    public static boolean checkUserName(String username) {
        //create the username requirements
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String password) {
        //create password requirements
        return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*") && password.matches(".*[!@#$%^&()].*");
        //*\\d.* is a meta chatracter that matches any didgit from 0-9. useful in code that requires integers
       // https://stackoverflow.com/questions/47341745/java-password-checker-with-strings
       //https://stackoverflow.com/questions/12885821/checking-if-a-character-is-a-special-character-in-java
    }

    public static boolean registerUser() {
        //Ibironke, A. (2021). Java Code: Login System. [Source code]. GitHub. https://gist.github.com/oyinibosi/a7cbce720d925f2c3a3a9aa90d1bf317
        Scanner scanner = new Scanner(System.in);
        //prompt user to enter first name, scanner reads input and nextLine skips a line when user presses eneter
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        //prompt user to enter last name
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        //prompt user to enter username
        System.out.print("Enter username: ");
        username = scanner.nextLine();
        
        if (checkUserName(username)) {//https://stackoverflow.com/questions/36392749/if-statements-and-usernames-password
            //message to be displayed if username matches requirements 
            System.out.println("Username successfully captured");
        } else {
            //error message to be displayed if username doesnt meet requirements 
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            return false;
        }

        System.out.print("Enter password: ");
        password = scanner.nextLine();

        if (checkPasswordComplexity(password)) {
            //message to be displayed if password matches requirements 
            System.out.println("Password successfully captured");
            return true;
        } else {
            //error message to be displayed if username doesnt meet requirements 
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a lowercase letter, a number, and a special character.");
            return false;
        }
    }

    public static boolean loginUser() {//https://rollbar.com/blog/handling-the-unreachable-statement-error-in-java/#:~:text=This%20error%20stems%20from%20irregularities,of%20a%20program%20is%20advisable.
        //call boolean to read user input 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Confirm username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Confirm password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Welcome, " + firstName + " " + lastName + "! It is great to see you again!");
            return true;
        } else {
            System.out.println("Username or password incorrect, please try again.");
            return false;
        }
    }

   
    }

