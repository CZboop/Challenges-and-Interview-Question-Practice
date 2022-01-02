package ArraysAndStrings;

//Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation
//is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
//EXAMPLE
//Input: Tact Coa
//Output: True (permutations: "taco cat". "atco cta". etc.)

import java.util.HashMap;
import java.util.Locale;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(checkPermutation("hy1234hgy"));
        System.out.println(checkPermutation("aaabaa"));
    }

    public static boolean checkPermutation(String string){
// ignoring non-alphabetical based on example, but same method would work with whatever want to include/exclude
        String cleanString = string.replaceAll("[^a-zA-Z]", "").toLowerCase();
        if (cleanString.length() == 0){
            return false;
        }
        if (cleanString.length() == 1){
            return true;
        }
//        getting counts of each character, will use simple logic of even character counts for even length
//        and even counts except one for odd length which allows for wildcard 'middle' character in odd length string
        HashMap<String, Integer> occurrences = new HashMap<>();
        for (int i=0; i<cleanString.length(); i++){
            String currentChar = String.valueOf(cleanString.charAt(i));
            if (occurrences.containsKey(currentChar)){
                Integer currentCount = occurrences.get(currentChar);
                occurrences.put(currentChar, ++currentCount);
            } else{
                occurrences.put(currentChar, 1);
            }
        }
//        counting number of odd values in the hashmap of character counts
        int oddCounter = 0;
        for (Integer count: occurrences.values()){
            if (count%2!=0){
                oddCounter += 1;
            }
        }
//        booleans for even length cleaned string and odd length cleaned string
        boolean validForEven = oddCounter==0 && cleanString.length()%2==0;
        boolean validForOdd = oddCounter==1 && cleanString.length()%2==1;

        return validForEven || validForOdd;
    }
}
