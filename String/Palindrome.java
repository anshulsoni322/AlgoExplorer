
// Check if a string is a PALINDROME
// 
// Time Complexity -> O(n)
// Space Complexity -> O(1)

public class Palindrome{
    public static void main(String args[]){
        String str = "racecar";
        if(isPalindrome(str)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is NOT Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        int length = str.length();
        for(int i = 0; i < str.length(); i++){

            // Compare characters from the start and end of the string
            if(str.charAt(i) != str.charAt(length-i-1)){
                return false; // It's not a palindrome
            }
        }
        return true; // it's palindrome
    }
}