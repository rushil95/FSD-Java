import java.util.Scanner;

class TrafficLight {
    public static void main(String[] args) {
        System.out.println("Enter your choice :");
        System.out.println("1 : Red");
        System.out.println("2 : Yellow");
        System.out.println("3 : Green");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();
        sc.nextLine();

        switch (userChoice) {
        case 1:
            System.out.println("Stop!");
            break;

        case 2:
            System.out.println("Ready!");
            break;

        case 3:
            System.out.println("Go!");
            break;

        default:
            break;
        }
        

    }
}