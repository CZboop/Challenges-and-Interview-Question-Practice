public class Bud {
    public static int howManyYears(String date1, String date2){
       String[] split1 = date1.split("/");
       String[] split2 = date2.split("/");
       return Math.abs(Integer.parseInt(split1[0]) - Integer.parseInt(split2[0]));
    }
}