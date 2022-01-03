package ArraysAndStrings;

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
