public class Diagonal
{
  public static int diagonalSum(final int[][] matrix)
  {
    int count = 0;
    for (int i=0; i < matrix.length; i++){
      count += matrix[i][i];
}
    return count;
  }
}