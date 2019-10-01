import java.util.Scanner;

class Binary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num1 = sc.nextInt();
    

        String res1 = "";
        while (num1 != 0) {
            res1 = res1 + Integer.toString((num1 % 2));
            num1 = num1 / 2;
        }
        String result1 = "";
        for (int i = res1.length() - 1; i >= 0; i--) {
            result1 += res1.charAt(i);
        }
        System.out.println(result1);
     
        sc.close();

    }
}
