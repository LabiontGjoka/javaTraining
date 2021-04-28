package day08_arithmetic_operators_casting;

import java.net.SocketOption;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {

        double balance = 345.55;

        double price1 = 20.88;
        double  price2 = 89.99;
        double price3 = 15;
        double remainingBalance=balance-(price1+price2+price3);
        int balanceWithNoCents = (int) balance;


        System.out.println("Your remainig Balance: $"+balance);
        System.out.println("Your remainig remangingBalance: $"+remainingBalance);
        System.out.println("your remaining balance without cents:  $"+ balanceWithNoCents);






    }

}
