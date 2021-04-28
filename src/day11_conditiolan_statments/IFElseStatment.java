package day11_conditiolan_statments;

public class IFElseStatment {
    public static void main(String[] args) {

        if(10 <5){
            System.out.println("CONDITITON IS TRUE  ");
        }else{
            System.out.println("CONDITION IS FALSE");
        }
        int count = 25;

        if (count > 30){
            System.out.println(count+" is more than 30");
        }else {
            System.out.println(count+" is less than 30");
        }

        byte age = 25;
        if (age >= 18){
            System.out.println("Eligible to vote ");
            System.out.println("Age is greater or equal to 18");
        }else{
            System.out.println("Not Eligible to vote");
            System.out.println("Age is less than 18");
        }



    }
}
