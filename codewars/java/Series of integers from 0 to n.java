public class Kata {
   public static int[] generateIntegers(int n){
      int[] series = new int[n + 1];
      for (int i = 0; i <= n; i++){
        series[i] = i;
      }
      return series;
   }
}