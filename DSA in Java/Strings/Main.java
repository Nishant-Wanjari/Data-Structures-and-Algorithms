import java.util.*;

public class Main {

    public static void main(String args[]) {
        // Calling the custom Substring method with startIndex 0 and endIndex 5
        System.out.println(Substring("Learning Java & DSA", 0, 5));
        
        // Using the built-in substring method of the String class
        String string = "Hello World";
        System.out.println("Using In-Built Method: " + string.substring(0, 5));
    }
    
    // Custom method to extract a substring from a given string
    public static String Substring(String string, int startIndex, int endIndex) {
        // Initialize an empty string to store the result
        String answer = new String();

        // Loop through the characters of the string from startIndex to endIndex-1
        for (int i = startIndex; i < endIndex; i++) {
            // Append each character to the result string
            answer = answer + string.charAt(i);
        }
        
        // Return the extracted substring
        return answer;
    }
}
