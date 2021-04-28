package day11_conditiolan_statments;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your totalPrice Value: ");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25){
            System.out.println("FREE SHIPPING IS ELIGIBLE. Your order total:  $"+totalPrice);
        }else{
            System.out.println("NOT ELIGIBLE FOR FREE SHIPPING. YOUR order total:  $"+totalPrice);

        }
        System.out.println("THANKS FOR SHIPPING AMAZON");
    }
}
