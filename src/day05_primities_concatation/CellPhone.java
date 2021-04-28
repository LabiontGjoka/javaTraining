package day05_primities_concatation;

public class CellPhone {
    public static void main(String[] args){
        String  brand = "Apple";
        String  model = "iPhone 11";
        String  color = "green";
        double  price = 699.0;
        int     storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println("Brand is "+ brand+"\n"  + "\nModel is "+model);
        System.out.println("Color is "+color);
        System.out.println("price is$"+price);
        System.out.println("Storage is "+ storage+" GB");
        System.out.println("Has camera? - "+ hasCamera);



    }
}
