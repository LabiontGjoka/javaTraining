package day14_multi_branch_if_statements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int selection = 12121;
        System.out.println("Choose your language");

        if (selection == 1) {
            System.out.println("Hello, thanks for your call");
        } else if (selection == 2) {
            System.out.println("Merhaba, aradinginiz ");
        } else if (selection == 3) {
            System.out.println("Pershentetje, faliminderit per thirrjen e juaj");
        } else if (selection == 4) {
            System.out.println("Merci, pour votre appel ");
        } else if (selection == 5) {
            System.out.println("Privet, spasibo za vash zvonok");
        } else {
            System.out.println("Lets talk java and english, hello");
        }
    }
}
