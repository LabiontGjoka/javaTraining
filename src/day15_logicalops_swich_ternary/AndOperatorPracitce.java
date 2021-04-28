package day15_logicalops_swich_ternary;

public class AndOperatorPracitce {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden spoon";
        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on- " + itemName);
        }
        if (freeShipping && onSale && itemName.equals("wooden spoon")){
            System.out.println("Adding to cart - " + itemName);
        }else{
            System.out.println("Continue shopping for good deals on - "+itemName);
        }

    }
}
