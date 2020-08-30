package com.bridgelabz.addressbook;

import com.bridgelabz.service.Helper;
import com.bridgelabz.utility.InputUtil;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        int choice, i = 0;

        final Helper help = new Helper();
        while (i == 0) {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Display Records     ");
            System.out.println("3: Edit Records        ");
            System.out.println("4: Delete Records      ");
            System.out.println("5: Sort Records	       ");
            System.out.println("6: View Person By City And State	       ");
            System.out.println("7: Exit                \n");
            System.out.println("--- Enter Your Choice ---");
            choice = InputUtil.getIntValue();
            switch (choice) {
                case 1 -> help.addRecord();
                case 2 -> help.displayRecord();
                case 3 -> help.editRecord();
                case 4 -> help.deleteRecord();
                case 5 -> help.sortRecords();
                case 6 -> help.viewByCityAndState();
                case 7 -> i = 1;
                default -> System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}
