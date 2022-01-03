package ArraysAndStrings;

public class OneAway {
    public static void main(String[] args) {
        System.out.println(check("ACDF", "acdF"));
        System.out.println(check("ACDFe", "acdF"));
        System.out.println(check("ACDFfe", "acdF"));
        System.out.println(check("ACgf", "acdF"));
        System.out.println(check("aabdcfgh", "abdcfgh"));
    }

    public static boolean check(String string1, String string2){
//        method will be case-insensitive so lower-casing the strings, could make case-sensitive if needed
        String string1Lower = string1.toLowerCase();
        String string2Lower = string2.toLowerCase();
//        preliminary checks for fixed true/false cases
        if (string1Lower.equals(string2Lower)){
            return true;
        }
        if (Math.abs(string1.length() - string2.length()) > 1){
            return false;
        }
//        different methods with if else, for replacement vs add/remove so can handle needing to check different index
        int diffCount = 0;
        if (string1Lower.length() != string2Lower.length()) {
            for (int i = 0; i < Math.min(string1Lower.length(), string2Lower.length()); i++) {
                if (string1Lower.charAt(i + diffCount) != string2Lower.charAt(i)) {
                    diffCount += 1;
                }
            }
        }
        else {
            for (int i = 0; i < string1Lower.length(); i++) {
                if (string1Lower.charAt(i) != string2Lower.charAt(i)) {
                    diffCount += 1;
                }
            }
        }
        return diffCount <= 1;
    }
}
