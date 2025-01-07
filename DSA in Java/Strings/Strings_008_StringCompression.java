public class Strings_008_StringCompression {
    public static void main(String args[]) {
        String string = "aaa";
        System.out.println(StringCompression(string));
    }
    
    public static String StringCompression(String string) {
        // Edge case: if string is empty, return it
        if (string.isEmpty()) {
            return string;
        }

        StringBuilder sb = new StringBuilder();
        
        // Initialize the first character and count
        char ch = string.charAt(0);
        sb.append(ch);
        int count = 1;
        
        // Iterate over the string starting from the second character
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                // If the current character is the same as the previous, increment count
                count++;
            } else {
                // If it's different, append the count and reset
                sb.append(count);
                ch = string.charAt(i); // Update to the new character
                sb.append(ch);
                count = 1; // Reset count to 1 for the new character
            }
        }

        // Append the last count
        sb.append(count);

        return sb.toString();
    }
}
