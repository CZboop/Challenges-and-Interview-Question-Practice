package LinkedLists;

import java.util.*;

public class ReturnKthToLast {
    public static void main(String[] args) {
        System.out.println(returnKth(new LinkedList<Integer>(Arrays.asList(1,2,2,2,3,3,3,4,4)), 0));
    }

    public static int returnKth(LinkedList list, int k){
        if (k < 0){
            throw new IllegalStateException("K cannot be negative");
        }
        int length = 0;
        for (Iterator<Integer> iter = list.iterator(); iter.hasNext();) {
            length+=1;
            iter.next();
        }
        int target = length - k - 1;
        if (target < 0){
            throw new IllegalStateException("Element does not exist");
        }
        Iterator<Integer> iter2 = list.iterator();
        for (int i=0; i<target; i++){
            iter2.next();
        }
        return iter2.next();
    }
}
