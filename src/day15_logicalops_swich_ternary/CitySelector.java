package day15_logicalops_swich_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if (city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to "+ city);
        }else{
            System.out.println("NOt considering - "+ city);
        }
        String teacher = "Murodil";
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("it is a java class with "+ teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("soft skill class with "+ teacher);
        }else {
            System.out.println("Some class with"+teacher);
        }

        String company = "Google";
        double salary = 100_000;
        if (company.equals("Google") || salary <=100_000){
            System.out.println("Accepting offer form "+ company);
        }else{
            System.out.println("Rejecting offer form "+ company);
        }

        }
    }

