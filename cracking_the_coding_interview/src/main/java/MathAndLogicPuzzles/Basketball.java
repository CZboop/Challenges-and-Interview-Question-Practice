package MathAndLogicPuzzles;

public class Basketball {
    public static void main(String[] args) {
        System.out.println(isOneShotBetter(0.99f));
        System.out.println(getCutoff());

    }
    public static String isOneShotBetter(float probability){
        float oneShot = probability;
//        adding here are need to take into account that making two shots means also missing the third
        float twoOfThree = (float) Math.pow(probability, 2) * (1 - probability);
        float allThree = (float) Math.pow(probability, 3);
        if (oneShot > (twoOfThree + allThree)){
            return "One Shot";
        }
        else if (oneShot == (twoOfThree + allThree)){
            return "Equal";
        }
        else if (oneShot < (twoOfThree + allThree)){
            return "Three Shots";
        }
        else{
            return "";
        }
    }
    public static float getCutoff(){
        float chance = 0.000001f;
        while (chance!=1f){
            String oneShot = isOneShotBetter(chance);
            if (oneShot == "Three Shots"){
                return chance;
            }
            chance += 0.000001f;
        }
        return -1;
    }
}
