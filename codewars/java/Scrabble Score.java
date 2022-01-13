public class Kata{
    public static int scrabbleScore(String word) {
      String wordclean = word.replaceAll("[^a-zA-Z]", "").toUpperCase();
      int score = 0;
      for (int i=0; i<wordclean.length(); i++){
          score += ScoreBoard.getScore(wordclean.charAt(i));
      }
      return score;
    }
}