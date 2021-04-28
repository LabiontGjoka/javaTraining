package day11_conditiolan_statments;
import java.util.Scanner;

public class ComparisonExamples {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int currentSpeed = 44;
        int speedLimit = 55;

        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit <currentSpeed);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed+"mph");
        System.out.println("speedLimit = " + speedLimit+"mph");
        // 45 + 20 ->65
        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed+"mph");
        System.out.println("speedLimit = " + speedLimit+"mph");

        double accountBalance = 250.25;
        double itemPrice = 100;
        System.out.println("Can I afford?" + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = "+ canAfford);

        accountBalance -= 200;
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am i Broke? - " + isBroke);




        }
}









