import java.util.*;

public class Strings_000_Introduction {
    public static void main(String args[]) {
        
        // Strings in Java are IMMUTABLE, meaning their content cannot be changed after they are created.
        
        // Create a Scanner object for reading user input
        Scanner input = new Scanner(System.in);   

        // Ask user for the first name
        System.out.println("Input First Name : ");
        String firstName = input.nextLine();  // Read the first name from user input
        
        // Ask user for the last name
        System.out.println("Input Last Name : ");
        String lastName = input.nextLine();  // Read the last name from user input
    
        // Concatenation of Strings in Java
        // Combine first name and last name with a space in between
        String fullName = firstName + " " + lastName;
        
        // Output the full name after concatenation
        System.out.println("Full Name : " + fullName);
        
        // Display the length of the concatenated full name
        System.out.println("Length : " + fullName.length());
    
        // Index and Access in Strings in Java
        // Access and display the character at the 0th index of the full name
        System.out.println("Character at 0th Index : " + fullName.charAt(0));
        
        // Access and display the character at the 1st index of the full name
        System.out.println("Character at 1st Index : " + fullName.charAt(1));
        
        // Access and display the character at the last index of the full name
        System.out.println("Character at Last Index : " + fullName.charAt(fullName.length() - 1));
        
        // Close the scanner to prevent resource leakage
        input.close();
    }
}
