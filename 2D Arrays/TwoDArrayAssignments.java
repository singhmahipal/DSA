
class TwoDArrayAssignments {

    public static void countOf7(int arr[][]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void print2ndRowSum(int arr[][]) {
        int sum = 0;
        for (int j = 0; j < arr[0].length; j++) {
            sum += arr[1][j];

        }

        System.out.println(sum);
    }

    public static void printTranspose(int arr[][]) {
        int transpose[][] = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        //print transpose
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // int arr[][] = { {4,7,8},{8,8,7} }; 
        // countOf7(arr);

        // int nums[][] = {{1,4,9},{11,4,3},{2,2,3} };
        // print2ndRowSum(nums);
        int arr[][] = {{4, 7, 8}, {8, 8, 7}};
        printTranspose(arr);
    }
}
