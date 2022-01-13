public class Kata {
    public static int[] generateIntegers(final int m, final int n) {
      int[] series = new int[n - m + 1];
      for (int i = m; i <= n; i++){
        series[i-m] = i;
      }
        return series;
    }
}