import java.util.*;

public class Strings_000_Introduction{
    public static void main(String args[]){
        
        // Strings are IMMUTABLE;
        
        Scanner input = new Scanner(System.in);   

        System.out.println("Input First Name : ");
        String firstName = input.nextLine();
        
        System.out.println("Input Last Name : ");
        String lastName = input.nextLine();
    
        
        // Concatenation of Strings in Java
        String fullName = firstName + " " +lastName;
        
        System.out.println("Full Name : "+fullName);
        System.out.println("Length : "+fullName.length());
    
        //Index and Access in Strings in Java
        System.out.println("Character at 0th Index : "+fullName.charAt(0));
        System.out.println("Character at 1st Index : "+fullName.charAt(1));
        System.out.println("Character at Last Index : "+fullName.charAt(fullName.length()-1));
        
        input.close();
    }
}