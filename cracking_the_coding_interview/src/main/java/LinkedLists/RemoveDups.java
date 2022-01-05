package LinkedLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDups {
    public static void main(String[] args) {
        System.out.println(removeWithBuffer(new LinkedList<Integer>(Arrays.asList(1,2,2,2,3,3,3,4,4))));

    }

    public static LinkedList<Integer> removeWithBuffer(LinkedList<Integer> linked){
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (Iterator<Integer> iter = linked.iterator(); iter.hasNext();){
            int current = iter.next();
            if (duplicates.contains(current)){
                iter.remove();
        } else{
                duplicates.add(current);
            }
        }
        return linked;
    }
}
