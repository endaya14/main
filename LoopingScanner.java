 import java.util.*;
public class LoopingScanner {
    static double getGrades(double... grades){
        double sum=0;
        for (int i = 0; i < grades.length; i++){
            sum = sum + grades[i]/grades.length;
        }
        return sum;
    }
    String subject(int x){
        return "";
    }
    public static void main(String[] args) {
        short numGrade;
        double values = 0.00;
        
        System.out.print("Total number of grades : ");
        Scanner gr = new Scanner(System.in);
        numGrade = gr.nextShort();
        double grade [] = new double[numGrade];
        System.out.println("Enter a series of values");
        for(int i = 0; i <grade.length;i++){
            System.out.print("Grade : ");
            Scanner inputX = new Scanner(System.in);
            values = inputX.nextDouble();
            grade[i] = values;
        }
        /*for(int output : grade){
            System.out.println("Grade : " + output);
        } */
        System.out.println("Average : "+getGrades(grade));


    }
} 
