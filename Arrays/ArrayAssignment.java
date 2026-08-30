
class ArrayAssignment {

    public static boolean containsDuplicate(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void buyAndSellStocks(int n[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n.length; i++) {
            if (buyPrice < n[i]) {
                int profit = n[i] - buyPrice;
                if (profit > 0) {

                    maxProfit = Math.max(maxProfit, profit);
                }
            } else {
                buyPrice = n[i];
            }
        }
        System.out.println("max profit = " + maxProfit);
    }

    public static void trapingRainWater(int height[]) {
        int n = height.length;

        // left boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // right boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 1; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            int barLevel = height[i];
            trappedWater += waterLevel - barLevel > 0 ? waterLevel - barLevel * 1 : 0;
        }

        System.out.println("total water trapped " + trappedWater);
    }

    public static void threeSum(int n[]) {
        System.out.print("[");
        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {

                for (int k = j + 1; k < n.length; k++) {
                    if ((n[i] + n[j] + n[k] == 0) && (i != j && i != k && j != k)) {
                        System.out.print("[" + n[i] + " + " + n[j] + " + " + n[k] + "] ");
                    }
                }
            }
        }
        System.out.println("]");

    }

    public static int search(int nums[], int tar) {
        // min will have index of minimum element of num
        int min = minSearch(nums);
        // find in sorted left
        if (nums[min] <= tar && tar <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, tar);
        } // find in sorted right
        else {
            return search(nums, 0, min - 1, tar);
        }
    }

    // binary search to find target in left to right boundary
    public static int search(int nums[], int left, int right, int tar) {
        int l = left;
        int r = right;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == tar) {
                return mid;
            } else if (tar > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    //smallest element index
    public static int minSearch(int nums[]) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[mid] > right) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(containsDuplicate(nums));
        buyAndSellStocks(nums);
        trapingRainWater(nums);
        threeSum(nums);
        System.out.println(search(nums, 2));
    }
}
