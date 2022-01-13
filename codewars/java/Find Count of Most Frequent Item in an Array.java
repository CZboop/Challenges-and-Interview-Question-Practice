import java.util.*;

public class Kata {
  public static int mostFrequentItemCount(int[] collection) {
    if (collection.length==0){
      return 0;
    }
    HashMap<Integer, Integer> counts = new HashMap<>();
    for (int i=0; i<collection.length; i++){
      if (counts.containsKey(collection[i])){
        counts.put(collection[i], counts.get(collection[i]) + 1);
      } else {
        counts.put(collection[i], 1);
      }
    }
      List<Integer> countArray = new ArrayList<>(counts.values());
      Collections.sort(countArray);
      return countArray.get(countArray.size() -1);
    }
}