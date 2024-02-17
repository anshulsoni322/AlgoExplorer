// Remove Duplicates in a String ->
// Given a string, remove duplicate characters and print the resulting string.

public class RemoveDuplicates{
    // Recursive function to remove duplicates from the string
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        // Base case: If index reaches end of string, print the new string and return
        if(idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // Recursive case: Process each character in the string
        char currChar = str.charAt(idx);
        // If current character is a duplicate, skip it and move to the next character
        if(map[currChar-'a'] == true) {
            removeDuplicates(str, idx+1, newStr, map);
        } 
        // If current character is not a duplicate, add it to the new string and mark it as visited
        else {
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }

    // Main method
    public static void main(String args[]){
        // Input string
        String str = "aabbccdd";
        // StringBuilder to store the new string without duplicates
        StringBuilder newStr = new StringBuilder();
        // Boolean array to track visited characters (assuming lowercase English letters only)
        boolean[] map = new boolean[26]; 

        removeDuplicates(str, 0, newStr, map);
    }
}