
// Determine if 2 Strings are anagrams of each other.
//
// What are anagrams?
// If two strings contain the same characters but in a different
// order, they can be said to be anagrams. Consider race and care.
// 
//  The code has a time complexity of O(n log n) due to sorting and a space
//  complexity of O(n) for the character arrays, where n is the length of the input strings.

import java.util.Arrays;

public class Anagrams{
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        boolean ans = isAnagrams(str1, str2);
        if (ans) {
            System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
    public static boolean isAnagrams(String str1, String str2){
        // Convert Strings to lowercase. Why? so that we don't have to check separately for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the lengths are the same
        if (str1.length() == str2.length()) {
            // Convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            // Sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            // If the sorted char arrays are the same or identical then the strings are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);

            return result;
        }
        
        // if the lengths are not same
        return false;
    }
}