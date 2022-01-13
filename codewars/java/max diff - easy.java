import java.util.*;

public class Kata {

  public static int maxDiff(int[] lst) {
    if (lst.length<1){
      return 0;
    }
    Arrays.sort(lst);
    return lst[lst.length-1] - lst[0];
  }
}