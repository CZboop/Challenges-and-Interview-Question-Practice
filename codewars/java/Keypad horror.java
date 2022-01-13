import java.util.HashMap;

public class Bud {
   public static String computerToPhone(String number){
     HashMap<Character, Character> map = new HashMap<>();
      map.put('7', '1');
      map.put('8', '2');
      map.put('9', '3');
      map.put('1', '7');
      map.put('2', '8');
      map.put('3', '9');     
     String newNum = "";
     for (int i=0; i<number.length(); i++){
       char elem = number.charAt(i);
       if (map.containsKey(elem)){
         newNum += map.get(elem);
       } else {
         newNum += elem;
       }
     }
     return newNum;
     }
}