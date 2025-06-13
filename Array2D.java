import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=3;
        int[][]matrix=new int[size][size];
        System.out.println("Enter elements");

        for(int row=0;row<size;row++){
            for (int col =0; col <size; col++){
                matrix[row][col] = sc.nextInt();
            }   
        }
        System.out.println("Elements are: ");
        for(int row=0;row<size;row++){
            for (int col =0; col <size; col++){
                System.out.print(matrix[row][col]+" ");
            }
        System.out.println();
    }
    }
}

