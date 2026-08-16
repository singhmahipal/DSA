
class Solution {

    public static void main(String args[]) {
        // Patterns (Part 1):

        // Nested Loop (star pattern)
        for (int line = 0; line < 5; line++) {
            for (int star = 0; star < i; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Inverted Start Loop
        for (int line = 1; line <= 5; line++) {
            for (int star = 1; star <= 5 - line + 1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // Half Pyramid Pattern
        for (int line = 1; line <= 5; line++) {
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println("");
        }

        // Print Character Pattern
        char ch = 'A';
        for (int line = 1; line <= 7; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }

        // Hollow Rectangle
        int rows = 5;
        int cols = 15;
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || col == 1 || row == rows || col == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // Inverted & Rotated Half Pyramid
        for (int line = 1; line < 5; line++) {
            for (int space = 1; space < line; space++) {
                System.out.print(" ");
            }
            for (int i = 1; i < 5 - line + 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // INVERTED HALF-PYRAMID wŤth Numbers pattern 
        for (int line = 1; line <= 5; line++) {
            for (int num = 5 - line + 1; num >= 1; num--) {
                System.out.print(num);
            }
            System.out.println("");
        }

        // FLOYD'S Triangle pattern 
        int n = 1;
        for (int line = 1; line <= 5; line++) {
            for (int nums = 1; nums <= line; nums++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println("");
        }

        // 0-1 Triangle pattern
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println("");
        }

        // BUTTERFLY pattern 
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            for (int space = 1; space < 4 - line + 1; space++) {
                System.out.print(" ");
            }
            for (int space = 1; space < 4 - line + 1; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int line = 4; line >= 1; line--) {
            for (int star = 1; star <= line - 1; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 4 - line + 1; space++) {
                System.out.print(" ");
            }
            for (int space = 1; space <= 4 - line + 1; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line - 1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // SOLID RHOMBUS pattern 
        for (int line = 1; line < 5; line++) {
            for (int space = 1; space < 5 - line; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 5; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // HOLLOW RHOMBUS
        int rows = 5;
        int cols = 5;
        for (int row = 1; row <= rows; row++) {
            for (int space = 1; space < rows - row + 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= cols; col++) {
                if (row == 1 || col == 1 || row == rows || col == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // DIAMOND pattern
        for (int line = 1; line <= 4; line++) {
            for (int space = 1; space <= 4 - line + 1; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= 2 * line - 1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int line = 4; line >= 1; line--) {
            for (int space = 4 - line + 1; space >= 1; space--) {
                System.out.print(" ");
            }

            for (int star = 2 * line - 1; star >= 1; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // NUMBER PYRAMID pattern 
        for (int line = 1; line <= 5; line++) {
            for (int space = 1; space < 5 - line + 1; space++) {
                System.out.print(" ");
            }
            for (int num = 1; num <= line; num++) {
                System.out.print(line + " ");
            }
            System.out.println("");
        }

        // PALINDROMIC Pattern with Numbers pattern 
        for (int line = 1; line <= 5; line++) {
            for (int space = 0; space < 5 - line + 1; space++) {
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
}
