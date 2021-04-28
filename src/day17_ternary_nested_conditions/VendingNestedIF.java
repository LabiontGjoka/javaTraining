package day17_ternary_nested_conditions;

public class VendingNestedIF {
    public static void main(String[] args) {
        String selection = "Drink";
        String drinkOrSnack = "coke";
        if (selection.equals("Drink")) {
            System.out.println("Drink option is selected");
            if (selection.equals("tea")) {
                System.out.println("tea is selected");
            } else if (drinkOrSnack.equals("coke")) {
                System.out.println("coke is selected ");
            } else {
                System.out.println("We dont serve that kind of drink");

            }


        } else if (selection.equals("Snack")) {
            System.out.println("snack option is selected");
            if (drinkOrSnack.equals("chips")) {
                System.out.println("Chips are selected");
            } else if (drinkOrSnack.equals("candy")) {
                System.out.println("candy is selected");
            } else {
                System.out.println("we don't serve that snack");
            }
        } else {
            System.out.println("we cannot do that ");
        }

    }
}
