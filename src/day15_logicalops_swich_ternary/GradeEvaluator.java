package day15_logicalops_swich_ternary;

public class GradeEvaluator {
    public static void main(String[] args){
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade =='C'||grade == 'a' || grade == 'b' || grade =='c'){
            System.out.println("passed with grade "+ grade);
        }else if (grade =='D'|| grade =='d'){
            System.out.println("qualify for retake "+grade);
        }else if (grade == 'E'|| grade == 'e'){
            System.out.println("Fail");
        }else{
            System.out.println("invalid grade");
        }
    }
}
