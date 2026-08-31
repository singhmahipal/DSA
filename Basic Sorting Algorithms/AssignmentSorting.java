
class AssignmentSorting {

    public static void bubbleSort(int nums[]) {
        for (int turn = 0; turn <= nums.length - 2; turn++) {
            for (int i = 0; i <= nums.length - 2 - turn; i++) {
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int nums[]) {
        for (int i = 0; i <= nums.length - 2; i++) {
            int max = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[max]) {
                    max = j;
                }
            }
            //swap
            int temp = nums[max];
            nums[max] = nums[i];
            nums[i] = temp;
        }
    }

    public static void insertionSort(int nums[]) {
        for (int i = 1; i <= nums.length - 1; i++) {
            int curr = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] < curr) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = curr;
        }
    }

    public static void countingSort(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }

        int count[] = new int[max + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = max; i > 0; i--) {
            while (count[i] > 0) {
                nums[j++] = i;
                count[i]--;
            }
        }
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(nums);
        selectionSort(nums);
        insertionSort(nums);
        countingSort(nums);
        printArr(nums);
    }
}
