package MathAndLogicPuzzles;

public class TheHeavyPill {
    public static void main(String[] args) {
        System.out.println(findHeavierInd(new float[]{1,1,1,1,1,1,1.1f,1,1,1,1,1,1,1,1,1,1,1,1,1}));

    }
    public static int findHeavierInd(float[] bottles){
//        the inputted array represents the weight of each pill inside the bottles
        float pillPile = 0f;
        int expected = 0;
        for (int i=0; i < bottles.length; i++){
            pillPile += bottles[i] * (i+1);
            expected += 1 * (i+1);
        }
        float scale = pillPile;
        float n = (scale - expected) / 0.1f;
        return Math.round(n-1);
    }
}
