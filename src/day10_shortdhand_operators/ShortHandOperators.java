package day10_shortdhand_operators;

public class ShortHandOperators {
    public static void main(String[] args){
        
        int cars = 10;
        System.out.println("cars = " + cars);
        
        cars= cars + 2;
        System.out.println("cars = " + cars);
        cars +=5;
        System.out.println("cars = " + cars);
        cars -=6;

        System.out.println("cars = " + cars);

        int electricCars = 13;
      // cars= cars + electricCars;
        System.out.println("cars = " + cars);
        cars += electricCars;
        
        String word = "Java";
        System.out.println("word = " + word);
        
        word = word + " programing";
        System.out.println("word = " + word);
        
        word += " is fun";
        System.out.println("word = " + word);
        
        String selenium = " but selenium is more fun";
        word += selenium;
        System.out.println("word = " + word);
        word +=  1234;
        System.out.println("word = " + word);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 2;
        System.out.println("letter = " + letter);
        // add 'J' to letter
        letter += 'j';
        System.out.println("letter = " + letter);
        
        
        double parkingFee = 7.50;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee /=2;
        System.out.println("Early parkingFee = " + parkingFee);
        parkingFee *=0;
        System.out.println("parkingFee = " + parkingFee);
        
        
        


    }
}
