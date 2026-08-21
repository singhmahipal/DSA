
class BonusPattern {

    // number pyramid
    public static void printNumberPyramid(int n) {
        for (int line = 1; line <= n; line++) {
            for (int space = 1; space <= n - line; space++) {
                System.out.print(" ");
            }

            for (int number = 1; number <= line; number++) {
                System.out.print(line + " ");
            }
            System.out.println("");
        }

    }

    // palindromic pattern with number
    public static void palindromicPatternWithNumber(int n) {
        for (int line = 1; line <= n; line++) {
            for (int space = 1; space < n - line + 1; space++) {
                System.out.print(" ");
            }

            for (int num = line; num >= 1; num--) {
                System.out.print(num);
            }

            for (int num = 2; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
        printNumberPyramid(5);
        palindromicPatternWithNumber(5);

    }
}
