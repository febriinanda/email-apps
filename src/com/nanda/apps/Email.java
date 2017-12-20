package com.nanda.apps;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternativeEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: "+ this.firstName +" "+this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    private String setDepartment(){
        System.out.println("Department Codes\n1 for Sale\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Codes:");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();

        if (depChoice == 1){
            return "sales";
        }else if (depChoice == 2){
            return "development";
        }else if (depChoice == 3){
            return "accounting";
        }else{
            return "";
        }
    }
}
