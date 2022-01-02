package ArraysAndStrings;

//Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
//bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
//Hints: #51, #100

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = new int[][] {new int[]{10,20,30,40}, new int[]{1,2,4,6},
                new int[]{100,200,300,400}, new int[]{55,77,66,88}};
        printMatrix(rotate(matrix1));
    }

//    currently rotates not in place - returns new matrix
    public static int[][] rotate(int[][] matrix){
        int[][] newMatrix = new int[matrix.length][matrix.length];
        for (int i = 0; i<matrix.length; i++){
            for (int j = 0; j<matrix.length; j++){
                 newMatrix[i][j] = matrix[j][matrix.length-i-1];
            }
        }
        return newMatrix;
    }

//    print method just for seeing what's happening while working on the problem
    public static void printMatrix(int[][] matrix){
        for (int i=0; i< matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
