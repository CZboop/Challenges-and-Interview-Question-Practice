package ArraysAndStrings;

//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
//cannot use additional data structures?
//Hints: #44, # 777, # 7 32

import java.util.HashMap;
import java.util.Locale;

public class IsUnique {
    public static void main(String[] args) {
        System.out.println(check("ffffff"));
        System.out.println(check("abdcefgh"));
        System.out.println(check("777"));

        System.out.println(checkNoDataStructure("ffffff"));
        System.out.println(checkNoDataStructure("abdcefgh"));
        System.out.println(checkNoDataStructure("777"));

    }
    public static boolean check(String string){
        if (string.length()==1){
            return true;
        }
        if (string.length()==0){
            return false;
        }
        String lowerString = string.toLowerCase();
        HashMap<Character, Integer> letterMap = new HashMap<>();
        for (int i=0; i<lowerString.length(); i++){
            if (letterMap.containsKey(lowerString.charAt(i))){
                return false;
            }
            else {
                letterMap.put(lowerString.charAt(i), 1);
            }
        }
        return true;
    }
    public static boolean checkNoDataStructure(String string){
        if (string.length()==1){
            return true;
        }
        if (string.length()==0){
            return false;
        }
        String lowerString = string.toLowerCase();
        String newString = String.valueOf(lowerString.charAt(0));
        for (int i=1; i<lowerString.length(); i++){
            if (newString.contains(String.valueOf(lowerString.charAt(i)))){
                return false;
            }
            else{
                newString += String.valueOf(lowerString.charAt(i));
            }
        }
        return true;
    }
}
