package ArraysAndStrings;

//Check Permutation: Given two strings, write a method to decide if one is a permutation of the
//other.
//Hints: #7, #84, #722, #737

//assuming exactly the same will not count as permutation and must have the same number of each character

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(check("abbdc", "bbadc"));
        System.out.println(check("abbbbdc", "bbadc"));
        System.out.println(check("dabbdc", "bbdfffadc"));
        System.out.println(check("abbdc", "abbdc"));

        System.out.println(checkNoStream("abbdc", "bbadc"));
        System.out.println(checkNoStream("abbbbdc", "bbadc"));
        System.out.println(checkNoStream("dabbdc", "bbdfffadc"));
        System.out.println(checkNoStream("abbdc", "abbdc"));

    }
    public static boolean check(String string1, String string2){
        if (string1.equals(string2) || string1.length() != string2.length()){
            return false;
        }
        if (string1.length() <= 1){
            return false;
        }
        ArrayList<String> string1ArrayList = new ArrayList<>(Arrays.asList(string1.split("")));

        Map<Character, Long> string1Occurrences = string1ArrayList.stream()
                .flatMap(a -> a.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        ArrayList<String> string2ArrayList = new ArrayList<>(Arrays.asList(string2.split("")));

        Map<Character, Long> string2Occurrences = string2ArrayList.stream()
                .flatMap(a -> a.chars().mapToObj(c -> (char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return string1Occurrences.equals(string2Occurrences);
    }

    public static boolean checkNoStream(String string1, String string2){
        if (string1.equals(string2) || string1.length() != string2.length()){
            return false;
        }
        if (string1.length() <= 1){
            return false;
        }
        HashMap<String, Integer> string1Occurrences = new HashMap<>();
        HashMap<String, Integer> string2Occurrences = new HashMap<>();
        for (int i=0; i<string2.length(); i++){
            String string1Char = String.valueOf(string1.charAt(i));
            String string2Char = String.valueOf(string2.charAt(i));
            if (string1Occurrences.containsKey(string1Char)){
                Integer currentCount = string1Occurrences.get(string1Char);
                string1Occurrences.put(string1Char, ++currentCount);
            }else{
                string1Occurrences.put(string1Char, 1);
            }
            if (string2Occurrences.containsKey(string2Char)){
                Integer currentCount = string2Occurrences.get(string2Char);
                string2Occurrences.put(string2Char, ++currentCount);
            }else{
                string2Occurrences.put(string2Char, 1);
            }
        }
        return string1Occurrences.equals(string2Occurrences);
    }
}
