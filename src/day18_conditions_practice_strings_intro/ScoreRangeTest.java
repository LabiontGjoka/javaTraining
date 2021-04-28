package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class ScoreRangeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your score ");
        int score = scan.nextInt();
        if (score >= 1 && score <= 40) {
            System.out.println("score = D " + score);
        } else if (score >= 41 && score <= 60) {
            System.out.println("score = C " + score);
        } else if (score >= 61 && score <= 90) {
            System.out.println("score = B " + score);
        } else if (score >= 91 && score <= 100) {
            System.out.println("score = A " + score);
        } else if (score <= 0 || score > 100) {
            System.out.println("Invalid score " + score);
        }
    }
}
