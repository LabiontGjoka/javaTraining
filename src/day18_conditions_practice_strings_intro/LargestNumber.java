package day18_conditions_practice_strings_intro;

public class LargestNumber {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 100;
        int num3 = 10;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("largest number " + num1);
        } else if (num2 >= num3) {
            System.out.println("largest number " + num2);
        } else {
            System.out.println("largest number " + num3);
        }
    }
}
