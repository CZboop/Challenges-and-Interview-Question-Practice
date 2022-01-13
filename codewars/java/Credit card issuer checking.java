import java.util.*;

public class Kata {
  public static String getIssuer(String cardNumber) {
    System.out.println(cardNumber);
    int len = cardNumber.length();
    
    if (cardNumber.charAt(0)=='4'){
      if (len==13 || len==16){
        return "VISA";
      } else {
        return "Unknown";
      }
    }
    if (len==15){
        if (cardNumber.substring(0,2).equals("34") || cardNumber.substring(0,2).equals("37")){
          return "AMEX";
        }
      }

    if (len==16){
      String[] mastercardArray = {"51", "52", "53", "54", "55"};
      if (cardNumber.substring(0,4).equals("6011")){
        return "Discover";
      }
      if (Arrays.asList(mastercardArray).contains(cardNumber.substring(0,2))){
        return "Mastercard";
      }
}
    return "Unknown";
  }
}