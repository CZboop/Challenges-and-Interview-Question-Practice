package ArraysAndStrings;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StringRotation {
    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
        System.out.println(isRotation("waterbtotle", "erbottlewat"));

        System.out.println(isRotationWithContains("waterbottle", "erbottlewat"));
        System.out.println(isRotationWithContains("waterbtotle", "erbottlewat"));

    }

//            checking one is rotation of another using queues
    public static boolean isRotation(String s1, String s2){
        if (s1.equals(s2)){
            return false;
        }

        if (Math.min(s1.length(), s2.length())==0 || s1.length() != s2.length()){
            return false;
        }

//creating queues of characters in each string
        Queue<Character> s1Queue = new LinkedList<>();
        for (int i=0; i<s1.length(); i++){
            s1Queue.add(s1.charAt(i));
        }
        Queue<Character> s2Queue = new LinkedList<>();
        for (int i=0; i<s2.length(); i++){
            s2Queue.add(s2.charAt(i));
        }
//checking rotation
        for (int i=0; i<s1.length(); i++){
            Character letter = s1Queue.remove();
            s1Queue.offer(letter);
            if (s1Queue.equals(s2Queue)){
                return true;
            }
        }
        return false;
    }

//    using contains (equivalent of isSubstring) to try it how the question suggests
    public static boolean isRotationWithContains(String s1, String s2){
//        assuming exact match does not count as a rotation
        if (s1.equals(s2)){
            return false;
        }

        String s2doubled = s2 + s2;

        return s2doubled.contains(s1);
    }
}
