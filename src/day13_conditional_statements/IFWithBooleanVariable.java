package day13_conditional_statements;

public class IFWithBooleanVariable {
    public static void main(String[] args) {

        boolean isHungry = "Hungry" == "Hungry";

        // if (isHungry == false)
        if (isHungry) {
            System.out.println("I am hungry, i will go get something to eat");
            System.out.println("then code java!");

        } else {
            System.out.println("I am not hungry,i will keeep coding java!");
        }
        System.out.println();
        System.out.println();
        double price = 230.44;
        boolean isAffordable = 200 >= price;
        System.out.println("isAffordable = " + isAffordable);

        if (isAffordable) {
            System.out.println("You can buy it, you dog");

        } else {
            System.out.println("Sorry you poor bastard, you cant buy it ");

        }
        System.out.println();
        boolean isRemoteJob = true;
        if (!isRemoteJob) {
            System.out.println("Sorry I am not interested ");
        } else {
            System.out.println("Sure I am interested, what is the interview process?");

        }


    }
}
