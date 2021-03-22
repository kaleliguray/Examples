package com.bankingExample;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        if(bank.addBranc("Adelaide")){
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide","Tim",50.50);
        bank.addCustomer("Adelaide","Mike",175.34);
        bank.addCustomer("Adelaide","Percy",220.12);

        bank.addBranc("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);

        bank.addCustomerTransaction("Adelaide","Tim",44.22);
        bank.addCustomerTransaction("Adelaide","Tim",12.44);
        bank.addCustomerTransaction("Adelaide","Mike",1.65);

        bank.listCustomers("Adelaide",true);
        bank.listCustomers("Sydney",true);


        bank.addBranc("Melbourne");

        if (!bank.addCustomer("Melbourne","Brian",5.33)){
            System.out.println("Melbourne branch does not exist");
        }

        if (!bank.addBranc("Adelaide")){
            System.out.println("Adelaide branch already exists");
        }





    }

}

























