public class Strings_005_LexographicalComparison {
    public static void main(String args[]) {
        /*
        Concept:
        - We need to find the lexicographically largest string, ignoring case sensitivity.
        - The `compareToIgnoreCase()` method is used to compare strings case-insensitively.
        - It returns a positive value if the first string is lexicographically greater,
          a negative value if it is smaller, and 0 if they are equal (ignoring case).
        - We will iterate through the array and keep updating the largest string found so far.
        - Finally, we print the largest string.
        */
        
        String fruits[] = {"Apple", "Mango", "Pineapple", "Appricot"};
        
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {  
                largest = fruits[i];
            }
        }

        System.out.println("Largest fruit (lexicographically): " + largest);
    }
}
