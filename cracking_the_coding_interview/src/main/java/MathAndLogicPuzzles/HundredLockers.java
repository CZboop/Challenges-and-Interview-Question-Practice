package MathAndLogicPuzzles;

import java.util.ArrayList;
import java.util.HashMap;

public class HundredLockers {
    public static void main(String[] args) {
        System.out.println(getOpen());
    }
    public static int getOpen(){
        HashMap<Integer, Boolean> lockerStates = new HashMap<>();
        for (int i=1; i<=100; i++){
            int factors = 0;
            for (int j=1; j<i; j++){
                if (i%j == 0) {
                    factors += 1;
                }
            }
            if (factors %2 == 1){
                lockerStates.put(i, false);
            }
            else{
                lockerStates.put(i, true);
            }
        }
        int count = 0;
        for (int i=1; i<=100; i++) {
            if (lockerStates.get(i)==true) {
                count ++;
            }
        }
        return count;
    }
}
