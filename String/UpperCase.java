
// Make UperCase letters
//
// For a given String convert each the first letter
// of each word to UPPERCASE
// "hi, this is a elephant" -> "Hi, This Is A Elephant".
//
// Time and Space Complexity -> O(n)

public class UpperCase{
    public static void main(String[] args) {
        String input = "hi, this is a elephant";
        String result = convertFirstLetterToUppercase(input);
        System.out.println("Original String: " + input);
        System.out.println("String with First Letter Uppercase: " + result);
    }

    public static String convertFirstLetterToUppercase(String input) {
        if (input == null || input.isEmpty()) {
            return input; // Return empty or null input as is
        }

        StringBuilder sb = new StringBuilder();

        // Convert the first letter of the first word to uppercase
        sb.append(Character.toUpperCase(input.charAt(0)));

        // Iterate through the input string
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);

            // If the previous character is a space, convert the current character to uppercase
            if (previousChar == ' ') {
                sb.append(Character.toUpperCase(currentChar));
            } else {
                // Otherwise, append the current character as is
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}