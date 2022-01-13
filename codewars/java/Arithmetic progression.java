class Progression {
  
  public static String arithmeticSequenceElements(int first, int step, long total) {
    String[] prog = new String[(int) total];
    for (int i=0; i<total; i++){
      prog[i] = String.valueOf(i * step + first);
    }
    return String.join(", ",prog);
  }
}