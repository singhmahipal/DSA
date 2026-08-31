
class Sorting {

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int swap = 0;
            for (int j = 0; j <= n - 2 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) {
                return;
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int count[] = new int[arr.length + 1];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i];
            count[idx] += 1;

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }

        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        countingSort(arr);
        printArr(arr);
    }
}
