package ArraysAndStrings;

//Check Permutation: Given two strings, write a method to decide if one is a permutation of the
//other.
//Hints: #7, #84, #722, #737

//assuming exactly the same will not count as permutation and must have the same number of each character

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckPermutation {
    public static void main(String[] args) {
        System.out.println(check("abbdc", "bbadc"));
        System.out.println(check("abbbbdc", "bbadc"));
        System.out.println(check("dabbdc", "bbdfffadc"));
        System.out.println(check("abbdc", "abbdc"));

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
}
