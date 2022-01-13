import java.util.*;

public class Kata {
   public static String makePassword(String phrase){
     String password = "";
     String[] words = phrase.split(" ");
     System.out.println(Arrays.toString(words));
     if (words[0].equals("")){
       return "";
     }
     HashMap<Character, Character> switchers = new HashMap<>();
     switchers.put('i', '1');
     switchers.put('I', '1');
     switchers.put('o', '0');
     switchers.put('O', '0');
     switchers.put('s', '5');
     switchers.put('S', '5');
     for (int i=0; i < words.length; i++){
       Character first = words[i].charAt(0);
       if (switchers.containsKey(first)){
         password += switchers.get(first);
       } else {
         password += first;
       }
     }
     System.out.println(password);
     return password;
   }
}