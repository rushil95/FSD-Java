import java.util.Scanner;

class Factorial {
    int calFactorial(int num) {
        if (num == 0)
            return 1;
        else
            return (num * calFactorial(num - 1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        sc.close();
        Factorial fac = new Factorial();
        int result = fac.calFactorial(num);
        System.out.println(result);
    }
}