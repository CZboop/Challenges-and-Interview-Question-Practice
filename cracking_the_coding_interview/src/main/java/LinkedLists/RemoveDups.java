package LinkedLists;

//Write code to remove duplicates from an unsorted linked list.
//FOLLOW UP
//How would you solve this problem if a temporary buffer is not allowed?

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class RemoveDups {
    public static void main(String[] args) {
        System.out.println(removeWithBuffer(new LinkedList<Integer>(Arrays.asList(1,2,2,2,2,3,3,4))));

    }

    public static LinkedList<Integer> removeWithBuffer(LinkedList<Integer> linked){
        ArrayList<Integer> duplicates = new ArrayList<>();

        Iterator iter = linked.iterator();

        while (iter.hasNext()){
            System.out.println(linked);
            if (duplicates.contains((int) iter.next())){
                iter.remove();
                iter.next();
            }
            else{
                duplicates.add((int) iter.next());
            }
        }

        return linked;
    }
}
