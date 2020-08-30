package com.bridgelabz.addressbook.controller;

import com.bridgelabz.addressbook.exception.AddressBookException;
import com.bridgelabz.addressbook.service.HelperService;
import com.bridgelabz.addressbook.utility.InputUtil;

public class AddressBook {
    public static void main(String[] args) throws AddressBookException {
        int i = 0;
        final HelperService help = new HelperService();
        while (i == 0) {
            System.out.println("--- Address Book Management ---\n");
            System.out.println("\t--MENU--");
            System.out.println("1: Add New Person      ");
            System.out.println("2: Display Records     ");
            System.out.println("3: Edit Person     ");
            System.out.println("4: Delete Person     ");
            System.out.println("5: Sort     ");
            System.out.println("6: Search     ");
            System.out.println("7: Exit		       \n");
            System.out.println("--- Enter Your Choice ---");
            int choice = InputUtil.getIntValue();
            switch (choice) {
                case 1 -> help.addRecord();
                case 2 -> help.displayRecord();
                case 3 -> help.editRecord();
                case 4 -> help.deleteRecord();
                case 5 -> help.sortRecords();
                case 6 -> help.searchInRecords();
                case 7 -> i = 1;
                default -> System.out.println("Please Enter Valid Option!!!");
            }
        }
    }
}