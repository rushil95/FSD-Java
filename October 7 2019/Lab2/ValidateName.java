import java.util.Scanner;

class ValidateName {
    void validateNames(String firstname, String lastName) throws MyException {
        if (firstname.isEmpty() || lastName.isEmpty()) {
            throw new MyException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name");
        String lastName = sc.nextLine();
        ValidateName vName = new ValidateName();
        try {
            vName.validateNames(firstName, lastName);
        } catch (MyException myException) {
            myException.printMsg();
        }

    }
}

class MyException extends Exception {
    void printMsg() {
        System.out.println("First and Last Name cannot be empty");
    }
}