
class Pattern {

    public static void main(String[] args) {
        // hollow rectangle 
        int rows = 4;
        int cols = 10;
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

        // Inverted & rotated half pyramid
        for (int line = 1; line <= 5; line++) {
            for (int space = 1; space <= 5 - line; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // inverted half pyramid with numbers
        for (int line = 1; line <= 5; line++) {
            for (int num = 1; num <= 5 - line + 1; num++) {
                System.out.print(num);
            }
            System.out.println("");
        }

        //floyd triangle
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println("");
        }

        // 0-1 triangle
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= line; i++) {
                if ((line + i) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println("");
        }

        // butterfly pattern
        for (int line = 1; line <= 5; line++) {
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            for (int space = 1; space <= 5 - line; space++) {
                System.out.print(" ");
            }
            for (int space = 1; space <= 5 - line; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int line = 1; line <= 5; line++) {
            for (int star = 5 - line + 1; star >= 1; star--) {
                System.out.print("*");
            }
            for (int space = line - 1; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int space = line - 1; space >= 1; space--) {
                System.out.print(" ");
            }
            for (int star = 5 - line + 1; star >= 1; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // solid rhombus
        for (int line = 0; line < 5; line++) {
            for (int space = 5 - line; space > 1; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star < 5; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        // hollow rhombus
        for (int line = 0; line < 5; line++) {
            for (int space = 5 - line; space > 0; space--) {
                System.out.print(" ");
            }
            for (int star = 0; star < 5; star++) {
                if (line == 0 || line == 4 || star == 0 || star == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        // diamond pattern
        for (int line = 1; line <= 5; line++) {
            for (int space = 5 - line - 1; space >= 0; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= 2 * line - 1; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int line = 1; line <= 5; line++) {
            for (int space = 1; space <= line - 1; space++) {
                System.out.print(" ");
            }

            for (int star = 10 - 2 * line + 1; star >= 1; star--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
