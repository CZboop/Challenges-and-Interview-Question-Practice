public class Solution
{
    public static long[] productArray(int[] numbers){
      long prodAll = 1;
      for (int i=0; i < numbers.length; i++){
        prodAll *= numbers[i];
      }
      long[] prodArray = new long[numbers.length];
      for (int i=0; i < numbers.length; i++){
        prodArray[i] = prodAll / numbers[i];
      }
        return prodArray;
    }
}