package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todaysClass = "python";

        if (todaysClass.equals("java"))
            System.out.println("Java is fun");
        else
            System.out.println("it is not java. it is " + todaysClass);

        int score = 1;

        if (score == 1)
            System.out.println("lowest score 1 ");
        else if (score == 2)
            System.out.println("score is " + score);
        else if (score == 3)
            System.out.println("score is " + score);
        else
            System.out.println("score is " + score);

        int a = 1;
        if (a == 1)
            System.out.println("a is 1");
        System.out.println("1 is a ");


    }
}
