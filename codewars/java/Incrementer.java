public class Kata {
  
  public static int[] incrementer(int[] numbers) {
    for (int i=0; i<numbers.length; i++){
      numbers[i] = (numbers[i] + i+1) % 10;
    }
    return numbers;
  }
}