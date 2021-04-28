package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Audi";
        char model = 'E';
        if (make.equals("Mercedes")){
            if (model == 'E'){
                System.out.println("Model "+model+" leasePrice = $500");
            }else if(model == 'A'){
                System.out.println("Model "+model+": leasePrice 400");
            }
        }else if (make.equals("Audi")){
            if (model == 'E')
            {
                System.out.println("Model "+model+" leasePrice = $543");
            }else if (model == 'A'){
                System.out.println("Model "+model+" leasePrice = $415");
            }
//a
        }else{
            System.out.println("we don't sell that kind of car ");
            return;// exit program/ exits main method
        }
    }
}
