package ArraysAndStrings;

//String Compression: Implement a method to perform basic string compression using the counts
//of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
//"compressed" string would not become smaller than the original string, your method should return
//the original string. You can assume the string has only uppercase and lowercase letters (a - z).
//Hints: #92, # 11 0

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compress("aaabbbccd"));
        System.out.println(compress("aabbccd"));

    }

    public static String compress(String string){
        if (string.length() <= 2){
            return string;
        }
// lower-casing here to make it case-insensitive, but would work as case-sensitive with same method
// if removed below and changed variable names to reflect change
//        added replaceall to handle newlines, as input will otherwise already meet the regex criteria
        String stringLower = string.toLowerCase().replaceAll("[^a-zA-Z]", "");

        String compressedString = "";
        int tempCount = 1;
        char currentChar = stringLower.charAt(0);
        for (int i=1; i<stringLower.length(); i++){
            if (i==stringLower.length()-1){
                if (stringLower.charAt(i)==currentChar){
                    tempCount += 1;
                }
                else {
                    compressedString += String.valueOf(currentChar) + String.valueOf(tempCount);
                    tempCount = 1;
                    currentChar = stringLower.charAt(i);
                }
                compressedString += String.valueOf(currentChar) + String.valueOf(tempCount);
            }
            else if (stringLower.charAt(i)==currentChar){
                tempCount += 1;
            }
            else {
                compressedString += String.valueOf(currentChar) + String.valueOf(tempCount);
                tempCount = 1;
                currentChar = stringLower.charAt(i);
            }
        }

        return compressedString.length() < string.length() ? compressedString : string ;
    }
}
