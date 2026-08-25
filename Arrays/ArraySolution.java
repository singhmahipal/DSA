
class ArraySolution {

    // linear search
    public static int findItem(String str[], String s1) {
        for (int i = 0; i < str.length; i++) {
            if (s1.equals(str[i])) {
                return i;
            }
        }

        return -1;
    }

    // Largest in array
    public static int getLargest(int nums[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    // Smallest Number in array
    public static int getSmallest(int nums[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        return min;
    }

    // Binary Search
    public static int binarySearch(int nums[], int n) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == n) {
                return mid;
            } else if (nums[mid] > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // reverse an array
    public static void reverseArr(int nums[]) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }

    // print pairs
    public static void printPairs(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                System.out.print("[" + nums[i] + ", " + nums[j] + "]");
            }
            System.out.println("");
        }
    }

    // print subarrays & max subarray sum (brute force)
    public static void printSubarray(int nums[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    sum += nums[k];
                }
                if (min > sum) {
                    min = sum;
                }

                if (max < sum) {
                    max = sum;
                }
                System.out.println();
            }
            System.out.println("");
        }
        System.out.println("max = " + max + " min = " + min);
    }

    // max subarray sum (prefix array)
    public static void maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max = " + maxSum);
    }

    // max subarray sum (kadane's algorithm)
    public static void maxSubarraySum1(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i] > 0 ? currSum + arr[i] : 0;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        // String str[] = {"coke", "pepsi", "thumbs up", "sprit"};
        // System.out.println(findItem(str, "coke"));
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // System.out.println(getLargest(nums));
        // System.out.println(getSmallest(nums));
        // System.out.println(binarySearch(nums, 1));
        // reverseArr(nums);
        // for (int i = 0; i < nums.length; i++) {
        //     System.out.print(nums[i] + " ");
        // }
        // printPairs(nums);
        // printSubarray(nums);
        maxSubarraySum1(nums);
    }
}
