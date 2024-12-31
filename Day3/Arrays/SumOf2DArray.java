package Day3;
import java.util.*;
public class SumOf2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row column value : ");
        int RowColumn = sc.nextInt();
        int[][] arr1 = new int[RowColumn][RowColumn];
        int[][] arr2 = new int[RowColumn][RowColumn];
        int[][] arr3 = new int[RowColumn][RowColumn];
        System.out.println("Enter the Array 1 values");
        for (int i = 0; i < RowColumn; i++) {
            for (int j = 0; j < RowColumn; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Array 2 values");
        for (int i = 0; i < RowColumn; i++) {
            for (int j = 0; j < RowColumn; j++) {
                arr2[i][j]+=sc.nextInt();
            }
        }

        for (int i = 0; i < RowColumn; i++) {
            for (int j = 0; j < RowColumn; j++) {
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of 2D Array");
        for (int i = 0; i < RowColumn; i++) {
            for (int j = 0; j < RowColumn; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
