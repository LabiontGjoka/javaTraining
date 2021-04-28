package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyotas = 431,hondas = 233,vW = 2, tesla = 20,nissan= 1,bmw=155;
         int totalCarsInParking = toyotas + hondas + vW+ tesla +nissan + bmw;
         System.out.println("There are "+totalCarsInParking+" cars in parking lot");

         String pizza = "hawaiian";
         int slices = 8;
         int people = 4;
         int slicesPerPerson = slices / people;

         System.out.println("There are "+slicesPerPerson+" slices per person");
         System.out.println("We orderd "+pizza+ " pizza with "+slices+" slices, "+people+" people ate "+slicesPerPerson+" slices each");
    }
}
