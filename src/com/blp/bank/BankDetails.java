package com.blp.bank;

public class BankDetails {

    long Acc_num = 123456789;
    String Customer_name = "Sayali";
    int Customer_age = 26;
    static String Bank_name = "State Bank Of India";

    public void Acc_num() {
        System.out.println("Account number: " + Acc_num);
    }
    public void Customer_name() {
        System.out.println("Name of account holder: " + Customer_name);
    }
    public void Customer_age() {
        System.out.println("Customer age of account holder: " + Customer_name);
    }
    public static void Bank_name() {
        System.out.println("Bank name of account holder: " + Bank_name);
    }
    public void display() {

            System.out.println("Bank name: " + Bank_name);
            System.out.println("Account number: " + Acc_num);
            System.out.println("Name of customer: " + Customer_name);
            System.out.println("Age of customer: " + Customer_age);

    }
        public static void main (String[]args){

            BankDetails Acc_num = new BankDetails();
            System.out.println("Account number: " + Acc_num);
            Acc_num.display();
            BankDetails Customer_name = new BankDetails();
            System.out.println("Name of account holder: " + Customer_name);
            Customer_name.display();
            BankDetails Customer_age = new BankDetails();
            System.out.println("Customer age of account holder: " + Customer_age);
            Customer_age.display();
        }
        }


