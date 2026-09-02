
class StringProblems {

    public static boolean checkPalindrome(String str) {
        boolean isPalindrome = false;
        for (int i = 0; i < str.length() / 2; i++) {
            isPalindrome = str.charAt(i) == str.charAt(str.length() - i - 1);
        }
        return isPalindrome;
    }

    public static void shortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N' ->
                    y++;
                case 'S' ->
                    y--;
                case 'E' ->
                    x++;
                default ->
                    x--;
            }
        }
        double path = x * x + y * y;
        double ans = Math.sqrt(path);
        System.out.println("shortest path = " + ans);
    }

    public static void toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i++));
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }

    public static void compressString(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count.toString());
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("racecar"));
        shortestPath("WNEENESENNN");
        toUpperCase("i love coding ");
        compressString("sstrrrrr");
    }
}
