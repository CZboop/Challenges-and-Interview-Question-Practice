public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      System.out.println(nBlue);
      if (nBlue < 2){
        return 0;
      }
        return (nBlue - 1) * 2;
    }
}