
class BitManipulationAssignment {

    public static void main(String[] args) {
        // Question1 : x^x for any value of x?
        System.out.println(56 ^ 56); // Think about it xor gives O when the bits are the same If we convare the same number to
        // itself, Will be the Same so. the answer Of Will always be O.

        // Question2 : Swap two numbers without using any third variable
        int a = 1;
        int b = 2;

        System.out.println("before swap: a = " + a + " after swap: b = " + b);

        // swap using xor 
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("after swap: a = " + a + " b = " + b);

        // Question3: Add l to an integer using Bit Manipulation
        int x = 1;
        System.out.println(x + " + 1 = " + -~x);

        int y = 0;
        System.out.println(y + " + 1 = " + -~y);

        int z = -5;
        System.out.println(z + " + 1 = " + -~z);

        // Question4 : Convert uppercase Characters to lowercase
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) (i | ' '));
        }

    }
}
