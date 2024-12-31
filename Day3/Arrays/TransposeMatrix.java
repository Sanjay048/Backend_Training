package Day3;
import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row value : ");
        int row = sc.nextInt();
        System.out.print("Enter the column value : ");
        int column = sc.nextInt();

        int[][] arr1 = new int[row][column];
        System.out.println("Enter the Array value");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] arr2 = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr2[j][i] = arr1[i][j];
            }
        }
        System.out.println("Transpose of Array");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
