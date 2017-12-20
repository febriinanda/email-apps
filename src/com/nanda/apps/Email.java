package com.nanda.apps;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private int passwordLength = 6;
    private String alternativeEmail;
    private String companySuffix = "almighty.com";

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: "+ this.firstName +" "+this.lastName);

        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        this.password = randomPassword(this.passwordLength);
        System.out.println("Your password: "+this.password);

        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
        System.out.println("Your email is "+email);
    }

    private String setDepartment(){
        System.out.println("Department Codes\n1 for Sale\n2 for Development\n3 for Accounting\n0 for None\nEnter Department Codes:");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();

        if (depChoice == 1){
            return "sales";
        }else if (depChoice == 2){
            return "dev";
        }else if (depChoice == 3){
            return "acct";
        }else{
            return "";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0;i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }
}
