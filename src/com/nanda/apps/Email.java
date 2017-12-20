package com.nanda.apps;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private int mailboxCapacity = 1000;
    private String alternativeEmail;



    Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        String department = setDepartment();

        int passwordLength = 6;
        this.password = randomPassword(passwordLength);
        System.out.println("Your password: "+this.password);

        String companySuffix = "almighty.com";
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
    }

    private String setDepartment(){
        String string = "New Worker: " +firstName +". " +
                "\nDepartment Codes" +
                "\n1 for Sales" +
                "\n2 for Development" +
                "\n3 for Accounting" +
                "\n0 for None" +
                "\nEnter Department Codes:";
        System.out.println(string);
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

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo(){
        return "Display Name: "+firstName+" "+lastName +
                "\nCompany Email: "+email+
                "\nMailbox Cap: "+ mailboxCapacity+"Mb";
    }
    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public void setAlternativeEmail(String alternativeEmail) {
        this.alternativeEmail = alternativeEmail;
    }
}
