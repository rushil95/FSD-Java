import java.util.Scanner;

class NthFibonacci {

    int fibonacciRecursive(int n) {
        if (n == 1 | n == 2)
            return 1;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    int fibonacciNonRecursive(int n) {
        int firstNum = 1;
        int secondNum = 1;
        int result = secondNum;
        for (int i = 3; i <= n; i++) {
            result = secondNum + firstNum;
            firstNum = secondNum;
            secondNum = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NthFibonacci fibonacci = new NthFibonacci();
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        // int result = fibonacci.fibonacciRecursive(n);
        int result = fibonacci.fibonacciNonRecursive(n);
        System.out.println("The " + n + "th Fibonacci number is " + result);
    }

}