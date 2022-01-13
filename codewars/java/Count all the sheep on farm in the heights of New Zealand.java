public class Kata {
  public static int lostSheep(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepTotal) {
    int sheepReturned = 0;
    for (int i = 0; i < fridayNightCounting.length; i++){
      sheepReturned += fridayNightCounting[i];
    }
    for (int i = 0; i < saturdayNightCounting.length; i++){
      sheepReturned += saturdayNightCounting[i];
    }
    int sheepDelta = sheepTotal - sheepReturned;
    return sheepDelta;
  }
}