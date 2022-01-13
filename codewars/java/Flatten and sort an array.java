import java.util.*;

public class Kata {

  public static int[] flattenAndSort(int[][] array) {
    ArrayList<Integer> nums = new ArrayList<>();
    for (int i=0; i<array.length; i++){
      if (array[i].length!=0){
        for (int j=0; j<array[i].length; j++){
            nums.add(array[i][j]);   
      }
        }
      }
    int[] numArray = new int[nums.size()];
    for (int i=0; i<nums.size(); i++){
      numArray[i] = nums.get(i);
    }
    Arrays.sort(numArray);
    return numArray;
  }
}