package day16_switch_ternary;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println("====== WELCOME TO ADAIRE APARTMENTS ==========");
        int numberOfBedroom = 0;
        double startingPrice = 0;
        switch (numberOfBedroom) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bed rom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bed rom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedroom + "bedroom currently unavailable");
        }
        System.out.println("Your bed room price $" + startingPrice);

    }
}
