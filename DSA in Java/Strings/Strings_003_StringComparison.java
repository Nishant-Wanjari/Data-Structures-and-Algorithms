public class Strings_003_StringComparison {
    public static void main(String args[]) {
        
        // Concept:
        // In Java, strings are objects, and there are two main ways to compare them:
        // 1. Using the '==' operator compares **references** (memory addresses), not the actual content of the strings.
        // 2. The `.equals()` method compares the **content** of the strings, i.e., the sequence of characters in the strings.
        
        String string01 = "Nagpur"; // Using string literal
        String string02 = "Nagpur"; // String literals are automatically stored in a shared pool
        String string03 = new String("Nagpur"); // Using the 'new' keyword creates a new String object in the heap

        // Comparing using '==' (checks if the references are the same)
        if (string01 == string02) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal");
        }

        // Comparing using '==' (different references, even though the content is the same)
        if (string01 == string03) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        // Comparing using '.equals()' (checks if the content of the strings is the same)
        if (string01.equals(string03)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
