
class Functions {

    // Find Factorial
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    // Find Binomial coefficient
    public static void printBino(int n, int r) {
        int res = fact(n) / (fact(r) * fact(n - r));
        System.out.println(res);
    }

    // check if number is prime or not
    public static void isPrime(int n) {
        boolean prime = true;
        if (n == 1) {
            prime = false;
        }
        if (n == 2) {
            prime = true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    // check if number prime (optimised)
    public static void isPrime1(int n) {
        boolean prime = true;
        if (n <= 1) {
            prime = false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println(n + " is prime");
        } else {
            System.out.println(n + " is not prime");
        }
    }

    // prime in range
    public static void primeInRange(int n) {
        for (int i = 1; i <= n; i++) {
            isPrime(i);
        }
    }

    // binary to decimal
    public static void binaryToDecimal(int binNum) {
        int n = binNum;

        int power = 0;
        int dec = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            dec = dec + lastDigit * (int) Math.pow(2, power);
            power++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + n + " is " + dec);
    }

    // decimal to binary
    public static void decimalToBinary(int decNum) {
        int n = decNum;
        int binNum = 0;
        int power = 0;
        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * (int) Math.pow(10, power);
            decNum = decNum / 2;
            power++;
        }
        System.out.println("binary of " + n + " is " + binNum);

    }

    // Question 1 : Write a Java method to compute the average of three numbers
    public static void calculateAverage(int a, int b, int c) {
        int res = (a + b + c) / 3;
        System.out.println("average of a, b & c = " + res);
    }

    // Question 2 : Write a method named isEven that accepts an int argument. The method 
    //should return true if the argument is even, or false otherwise. Also write a program to test 
    // your method. 
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is 
    // a palindrome, 321 is not) 
    // A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is 
    // a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a 
    // palindrome because the reverse of 321 is 123, which is not equal to 321. 
    public static void isPalindrome(int n) {
        int ogNum = n;
        int revNum = 0;
        int power = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            revNum = revNum * 10 + lastDigit;
            n = n / 10;
            power++;
        }

        if (ogNum == revNum) {
            System.out.println(ogNum + " is palindrome");
        } else {
            System.out.println(ogNum + " is not palindrome");
        }
    }

    // Question 4 : Write a Java method to compute the sum of the digits in an integer. 
    public static void calculateDigitSum(int n) {
        int ogNum = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        System.out.println("sum of digits of " + ogNum + " is " + sum);
    }

    public static void main(String[] args) {
        System.out.println(fact(10));
        printBino(5, 2);
        isPrime(8);
        primeInRange(10);
        binaryToDecimal(101110101);
        decimalToBinary(5);
        calculateAverage(1, 1, 1);
        System.out.println(isEven(1));
        isPalindrome(12);
        calculateDigitSum(1001);
    }
}
