package day15_logicalops_swich_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!ture = " + !true);
        System.out.println("!false = " + !false);

        int age = 2;
        if (!(age > 7)){
            System.out.println("need to sit in child car seat");
        }else{
            System.out.println("Can sit normal seat. age = "+ age);
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }

        boolean isAffordable = true;
        if (isAffordable){
            System.out.println("Item not affordable");
        }
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested, thank you");
        }
        String secretPassword = "abc123";
        String  imputPassword = "abc321";
        if (!imputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }

    }
}
