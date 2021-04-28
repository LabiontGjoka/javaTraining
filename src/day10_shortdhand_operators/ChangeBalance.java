package day10_shortdhand_operators;

public class ChangeBalance {
    public static void main(String[] args){
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + baklava);

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after kenafe = " + balance);
        
        // second kenafe is 50% off, lets buy it 
        
        kenafe= kenafe / 2;
        System.out.println("kenafe = " + kenafe);
        balance=balance - kenafe;
        System.out.println("balance after the other kenafe = " + balance);

        double pilov = 7.99;
        System.out.println("pilov = "+pilov);
        balance = balance - pilov;
        System.out.println("balance after pilov= " + balance);

        double icedTea = 3;
        System.out.println("icedTea = " + icedTea);
        icedTea = icedTea * 4;
        System.out.println("icedTea = " + icedTea);
        balance = balance - icedTea;
        System.out.println("balance after icedtea = " + balance);

        System.out.println("returnig baklava = "+baklava);

        balance= balance + baklava;
        System.out.println("balance after returnig baklava= " + balance);


        
        
        
        


    }
}
