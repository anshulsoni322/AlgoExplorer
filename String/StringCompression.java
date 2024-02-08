
// String Compression
//
// "aabbccdd" -> "a3b2c3d2"
//
// Both functions have a time and space complexity of O(n)
// due to iterating through the input string and storing the compressed result.

public class StringCompression{
    public static void main(String args[]){
        String str = "aaabbbccc";
        // Compresstion using String
        System.out.println("From String = "+compresstionS(str));
        // Compresstion using StringBuilder
        System.out.println("From StringBuilder = "+compresstionSB(str));
    }
    public static String compresstionS(String str){
        String compressed = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count consecutive repeating characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append character to compressed string
            compressed += str.charAt(i);

            // Append count if it's greater than 1
            if (count > 1) {
                compressed += count;
            }
        }

        return compressed;
    }
    public static String compresstionSB(String str){
        StringBuilder compressed = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            int count = 1;

            // Count consecutive repeating characters
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }

            // Append character to compressed string
            compressed.append(str.charAt(i));

            // Append count if it's greater than 1
            if(count > 1){
                compressed.append(count);
            }
        }

        return compressed.toString();
    }
}