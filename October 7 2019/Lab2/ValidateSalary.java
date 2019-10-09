import java.util.Scanner;

import com.cg.eis.exception.EmployeeException;

class ValidateSalary {
    void validateSalary(int salary) throws EmployeeException {
        if (salary <= 15) {
            throw new EmployeeException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary");
        int salary = sc.nextInt();
        sc.nextLine();
        ValidateSalary vSalary = new ValidateSalary();
        try {
            vSalary.validateSalary(salary);
        } catch (EmployeeException employeeException) {
            employeeException.printMsg();
        }

    }
}