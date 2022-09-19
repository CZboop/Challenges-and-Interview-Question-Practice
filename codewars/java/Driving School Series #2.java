public class Kata {
    public static int cost(int mins){
      if (mins <= 65){
        return 30;
      }
      int minsOverHr = mins - 60;
      int extraCost = (int) Math.ceil((double) (minsOverHr - 5) / 30) * 10;
      return 30 + extraCost;
    }
}