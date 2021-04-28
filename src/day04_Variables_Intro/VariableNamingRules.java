package day04_Variables_Intro;

public class VariableNamingRules {
    public static void main(String[] args){

        // int static = 22; -->error, static is reserved by java;

        int static2 = 22;
        int _static = 22;
        int staticVar = 234;

        int slaery$ = 55;
        // int 1stMonthSalary = 3000; -> error cannot start with number
       int $ = 10;
       int s= 3;
       System.out.println($);
       System.out.println(s);
       // Above Var work fine, but not recommendet
        // we should use meanigfoul names

    }
}
