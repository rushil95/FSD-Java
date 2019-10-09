import java.util.Scanner;

class ValidateAge {
    void validateAge(int age) throws AgeException {
        if (age <= 15) {
            throw new AgeException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        sc.nextLine();
        ValidateAge vAge = new ValidateAge();
        try {
            vAge.validateAge(age);
        } catch (AgeException ageException) {
            ageException.printMsg();
        }

    }
}

class AgeException extends Exception {
    void printMsg() {
        System.out.println("Age less than 15");
    }
}