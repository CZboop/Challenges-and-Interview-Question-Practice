import java.util.*;

public class Solution
{
    public static int maxGap(int[] numbers)
    {
        int[] diffs = new int[numbers.length - 1];
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length-1; i++){
          diffs[i] = numbers[i+1] - numbers[i];
        }
        Arrays.sort(diffs);
        return diffs[diffs.length - 1];
    }
}