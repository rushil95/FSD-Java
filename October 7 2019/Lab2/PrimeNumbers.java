import java.util.Scanner;

class PrimeNumbers{
    void printPrimeNumbers( int n ){
        for(int num=2; num<n; num++){
            boolean flag = false;
            for(int i=2 ;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    flag = true;
                    break;
                }   
            }
            if(flag == false)
                System.out.println(num + " is Prime ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.printPrimeNumbers(n);

    }
}