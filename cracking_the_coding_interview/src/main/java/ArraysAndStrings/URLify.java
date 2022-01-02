package ArraysAndStrings;

//URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
//has sufficient space at the end to hold the additional characters, and that you are given the "true"
//length of the string. (Note: If implementing in Java, please use a character array so that you can
//perform this operation in place.)
//EXAMPLE
//Input: "Mr John Smith "J 13
//Output: "Mr%20J ohn%20Smith"

public class URLify {
    public static void main(String[] args) {
        System.out.println(makeURL("testing  testing    testing", getTrueLength("testing  testing    testing")));
        System.out.println(makeURL("time after time", getTrueLength("time after time")));

    }
    public static String makeURL(String string, int length){
        char[] charArray = new char[length];
        int charArrayIndex = 0;
        for (int i=0; i < string.length(); i++){
            if (string.charAt(i)==(' ')){
                charArray[charArrayIndex] = '%';
                charArray[charArrayIndex + 1] = '2';
                charArray[charArrayIndex + 2] = '0';
                charArrayIndex += 3;
            }
            else{
                charArray[charArrayIndex] = string.charAt(i);
                charArrayIndex += 1;
            }
        }
        return new String(charArray);
    }

    public static int getTrueLength(String string){
        int count = 0;
        for (int i=0; i<string.length(); i++){
            if (string.charAt(i)==' '){
                count ++;
            }
        }
        return string.length() + count * 2;
    }
}
