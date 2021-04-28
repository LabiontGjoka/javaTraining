package day13_conditional_statements;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("***** WELCOME TO TD BANK ATM ****");
        int secretPincode = 416;
        System.out.println("Enter your PinCode");
      int imputPincode = scan.nextInt();


        if (secretPincode == imputPincode){
            System.out.println("Welcome to your account.");
            System.out.println("You can withdraw, check balance, deposit");
        }else{
            System.out.println("Incorrent pincode ! "+imputPincode);
            System.out.println("Please try again :)");
        }

    }
}
