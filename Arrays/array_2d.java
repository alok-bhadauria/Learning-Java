import java.util.*;

public class array_2d {
    public static void main(String args[]) {

        // Creating empty 2d array (matrix) of dimensions m x n
        int [][] arr = new int[3][4];
        Display(arr);
        System.out.println();


        // Creating 2d array with data (size: 4x4)
        int [][] arr1 = {{1,2,3,4}, {5,6,7,8},{1,3,5,7}, {2,4,6,8}};
        Display(arr1);
        System.out.println();


        // Creating empty 2d array with input
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of rows : ");
        int m = sc.nextInt();
        System.out.print("Number of columns : ");
        int n = sc.nextInt();

        int [][] arr2 = new int[m][n];
        Display(arr2);
        System.out.println();


        // Creating 2d array with data input
        System.out.print("Number of rows : ");
        int m1 = sc.nextInt();
        System.out.print("Number of columns : ");
        int n1 = sc.nextInt();

        int [][] arr3 = new int[m1][n1];
        for(int i = 0; i < m1; i++){
            for(int j = 0; j < n1; j++){
                arr3[i][j] = sc.nextInt();
            }
        }
        Display(arr3);
        System.out.println();
                        
        sc.close();
    }


    // Function to display 2d array
    public static void Display(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}