import java.util.Scanner;

class ResultCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second limit");
        int num2 = sc.nextInt();

        if (num1 >= 40) {
            if (num2 >= 40) {
                int total = num1 + num2;
                if (total >= 125)
                    System.out.println("PASSING");

                if (total < 125)
                    System.out.println("FAILING");

            }
        }
        sc.close();
    }

}