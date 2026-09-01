
import java.util.Scanner;

class TwoDArrayOperations {

    public static void findMinAndMax(int arr[][]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int n = arr.length, m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < m; k++) {
                if (min > arr[i][k]) {
                    min = arr[i][k];
                }

                if (max < arr[i][k]) {
                    max = arr[i][k];
                }
            }
        }
        System.out.println("max & min = " + max + " & " + min);
    }

    public static void SpiralMatrix(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length - 1;
        int startCol = 0;
        int endCol = arr[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = 0; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }

            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }

            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }

            //left
            for (int i = endRow - 1; i > startRow + 1; i--) {
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }

    public static void DiagonalSum(int arr[][]) {
        int sum = 0;
        // O(n^2)
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[0].length; j++) {
        //         if (i == j || i + j == arr.length - 1) {
        //             sum += arr[i][j];
        //         }
        //     }
        // }

        // O(n)
        for (int i = 0; i < arr.length; i++) {
            //pd
            sum += arr[i][i];

            //sd
            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        System.out.println("sum = " + sum);
    }

    public static void stairCaseSearch(int arr[][], int key) {
        // int i = 0;
        // int j = arr.length - 1;
        // while (i < arr.length && j >= 0) {
        //         int curr = arr[i][j];
        //         if (key == curr) {
        //             System.out.println("found at " + i + ", " + j);
        //             return;
        //         } else if (key > curr) {
        //             i++;
        //         } else {
        //             j--;
        //         }
        //     }  

        int i = arr.length - 1, j = 0;
        while (i >= 0 && j < arr.length) {
            if (key == arr[i][j]) {
                System.out.println("found at " + i + ", " + j);
                return;
            } else if (key < arr[i][j]) {
                i--;
            } else {
                j++;
            }
        }
    }

    public static void printArr(int arr[][]) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // findMinAndMax(arr);
        // printArr(arr);
        //SpiralMatrix(arr);
        //DiagonalSum(arr);
        stairCaseSearch(arr, 3);
    }
}
