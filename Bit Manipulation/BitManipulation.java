
class BitManipulation {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     clearIthBit(n, i);
        // } else {
        //     setIthBit(n, i);
        // }

        int bitMask = newBit << i;
        n = clearIthBit(n, i);
        n = n | bitMask;
        System.out.println(n);
    }

    public static void clearLastIthBit(int n, int i) {
        int bitMask = ~0 << i;
        n = n & bitMask;
        System.out.println(n);
    }

    public static void clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        n = n & bitMask;
        System.out.println(n);
    }

    public static void isPowerOf2(int n) {
        if ((n & n - 1) == 0) {
            System.out.println(n + " is power of 2");
        } else {
            System.out.println(n + " is not of the power of 2");
        }
    }

    public static void countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;

            }
            n = n >> 1;
        }
        System.out.println("count = " + count);
    }

    public static void fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            n = n >> 1;
            a = a * a;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        
class Solution {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void updateIthBit(int n, int i, int newBit) {
        // if (newBit == 0) {
        //     clearIthBit(n, i);
        // } else {
        //     setIthBit(n, i);
        // }

        int bitMask = newBit << i;
        n = clearIthBit(n, i);
        n = n | bitMask;
        System.out.println(n);
    }

    public static void clearLastIthBit(int n, int i) {
        int bitMask = ~0 << i;
        n = n & bitMask;
        System.out.println(n);
    }

    public static void clearBitsInRange(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;
        int bitMask = a | b;
        n = n & bitMask;
        System.out.println(n);
    }

    public static void isPowerOf2(int n) {
        if ((n & n - 1) == 0) {
            System.out.println(n + " is power of 2");
        } else {
            System.out.println(n + " is not of the power of 2");
        }
    }

    public static void countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;

            }
            n = n >> 1;
        }
        System.out.println("count = " + count);
    }

    public static void fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans *= a;
            }
            n = n >> 1;
            a = a * a;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(4);
        oddOrEven(10);

        System.out.println(getIthBit(3, 0));
        System.out.println(setIthBit(2, 0));
        System.out.println(setIthBit(4, 2));
        System.out.println(clearIthBit(2, 1));
        System.out.println(clearIthBit(4, 2));
        System.out.println(clearIthBit(5, 0));
        System.out.println(clearIthBit(6, 2));

        updateIthBit(1, 0, 0);
        updateIthBit(2, 1, 0);
        updateIthBit(3, 0, 0);
        updateIthBit(4, 1, 1);

        clearLastIthBit(3, 2);
        clearLastIthBit(7, 2);

        clearBitsInRange(10, 2, 4);

        isPowerOf2(6);
        isPowerOf2(12);
        isPowerOf2(13);
        isPowerOf2(14);
        isPowerOf2(16);

        countSetBits(9);
        countSetBits(15);
        countSetBits(16);
        
        fastExpo(5, 3);
    }
}

    }
}
