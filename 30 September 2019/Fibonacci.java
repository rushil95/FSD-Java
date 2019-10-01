class Fibonacci {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 0;
        System.out.println(0);
        System.out.println(1);
        while (c < 89) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }

    }
}