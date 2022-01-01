import java.util.Collection;

class Solution {
    public boolean isValid(String s) {
    if (s == "") {
        return false;
    }
    Stack<Character> chars = new Stack<>();
    Map<Character, Character> pairsMap = Map.of('(', ')', '{', '}', '[', ']');
    Set<Character> opening = pairsMap.keySet();
    Collection<Character> closing  = pairsMap.values();
    for (int i = 0; i < s.length(); i++) {
        Character target = s.charAt(i);
        if (opening.contains(target)) {
            chars.push(target);
        }
        else if (closing.contains(target)){
            try{
                if (pairsMap.get(chars.peek()) == target) {
                    chars.pop();
                } else {
                    return false;
                }
                
            } catch(Exception e){
                    return false;
                }     
    }
} if (chars.isEmpty()) return true;
    else return false;
    }
}