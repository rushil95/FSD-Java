package com.cg.eis.exception;

public class EmployeeException extends Exception {
    public void printMsg() {
        System.out.println("Exception! Salary below 3000");
    }
}