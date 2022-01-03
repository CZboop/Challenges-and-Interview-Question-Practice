package ArraysAndStrings;

import java.util.ArrayList;
import java.util.Arrays;

public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {
                new int[]{10,8,30,40},
                new int[]{1,0,4,6},
                new int[]{100,200,0,400},
                new int[]{55,77,66,88}};
        printMatrix(zero(matrix1));
    }

    public static int[][] zero(int[][] matrix){
        int[][] newMatrix = matrix;
        ArrayList<Integer> zeroRows =  new ArrayList<>();
        ArrayList<Integer> zeroCols =  new ArrayList<>();

//        getting locations of zeros
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j]==0){
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

//        filling rows with zeros
        for (int i=0; i<matrix.length; i++){
            if (zeroRows.contains(i)){
                for (int j=0; j< matrix[0].length; j++){
                    newMatrix[i][j] = 0;
                }
            }
            else{
                for (int j=0; j< matrix[0].length; j++){
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }

// filling columns with zeros
        for (int i=0; i<matrix[0].length; i++){
            if (zeroCols.contains(i)){
                for (int j=0; j< matrix.length; j++){
                    newMatrix[j][i] = 0;
                }
            }
        }
        return newMatrix;
    }

//    printing matrix for use while writing solution
    public static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
