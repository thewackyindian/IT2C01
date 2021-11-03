/**
 * in the given question order of matrix multiplication was given as (3x4)*(2x3) which is not possible......
 * so i have interchanged the order
 * @author : Raj Karan Singh Chhabra
 */
import java.util.*;
public class Matrixmultiply
{
    static void multiply(int matrix_first[][],int matrix_second[][], int res[][],int row_first,int row_second,int col_first,int col_second)
    {
        int i, j, k;
        for (i = 0; i < row_first; i++) {
            for (j = 0; j < col_second; j++) {
                res[i][j] = 0;
                for (k = 0; k < col_first; k++){
                    res[i][j] += matrix_first[i][k] * matrix_second[k][j];
                }
            }
                    
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first matrix of [2 X 3]");
        int row_first =2;
        int col_first =3;
        int matrix_first[][] = new int[row_first][col_first];
        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < col_first; j++)
                matrix_first[i][j] = sc.nextInt();
        }
        System.out.println("Enter the second matrix of [3 X 4]");
        int row_second =3;
        int col_second =4;
        int matrix_second[][] = new int[row_second][col_second];
        for (int i = 0; i < row_second; i++) {
            for (int j = 0; j < col_second; j++)
                matrix_second[i][j] = sc.nextInt();
        }
        /*concept : if col_first not euqal to row_second matrix multiplication not possible*/ 
        // To store result
        int res[][] = new int[row_first][col_second];
        multiply(matrix_first, matrix_second, res,row_first,row_second,col_first,col_second);

        System.out.println("Result matrix is : ");
        for (int i = 0; i < row_first; i++) {
            for (int j = 0; j < col_second; j++){
                System.out.print(res[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}