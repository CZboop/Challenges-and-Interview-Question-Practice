public class Drinkin {
    public String hydrate(String drinkString) {
        String nums = drinkString.replaceAll("[^0-9]","");
        int count = 0;
        for (int i=0; i<nums.length(); i++){
          count += Integer.parseInt(String.valueOf(nums.charAt(i)));
        }
        if (count == 1) {
          return "1 glass of water";
        }
        return String.valueOf(count) + " glasses of water";
    }
}