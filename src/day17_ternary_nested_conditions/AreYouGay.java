package day17_ternary_nested_conditions;
import java.util.Scanner;
public class AreYouGay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you gay yes or no ");
        String gay= scan.nextLine();
        if (gay.equals("Yes") || gay.equals("yes")){
            System.out.println("You fcking, fagot");

        }else if(gay.equals("No")|| gay.equals("no")){
            System.out.println("are you sure? lets try it again");
            System.out.println("Are you sure u are not gay, yes or no ");
            gay = scan.nextLine();
            if (gay.equals("yes") || gay.equals("Yes")){
                System.out.println("have u ever sucked a dick yes or no");
                gay = scan.nextLine();
                if (gay.equals("yes")){
                    System.out.println("what a fucking gay");
                }else if(gay.equals("no")||gay.equals("No")){
                    System.out.println("if u are gay and you know it, clap, your hands");
                    System.out.println("Did u clap your hands ?");
                    gay = scan.nextLine();
                    if (gay.equals("Yes") ||gay.equals("yes")){
                        System.out.println("i knew it you are gay");

                    }else{
                        System.out.println("Congrats you are not gay");
                    }
                }else{

                }
            }else {
                System.out.println("You see you are gay, god hates you and you will go to hell muahhahahahah");
            }

        }else{
            System.out.println("whats that u fagot, i said yes or no. ");
        }

    }
}
