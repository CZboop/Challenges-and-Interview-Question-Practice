public class Numbers
{
  public static double twoDecimalPlaces(double number){
    String numStr = String.valueOf(number);
    int decimalLoc = 0;
    for (int i=0; i < numStr.length(); i++){
      if (numStr.charAt(i) == '.'){
        decimalLoc = i;
      }
    }
    return Double.parseDouble(numStr.substring(0, decimalLoc + 3));    
  }
}