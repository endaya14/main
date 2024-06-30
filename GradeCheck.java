import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        int input;
        System.out.print("Please enter your grade : ");
        Scanner grade = new Scanner(System.in);
        input = grade.nextInt();

        if(input >= 90){

            System.out.println("A");

        }else if(input >= 80 && input <=89){

            System.out.println("B");

        }else if(input >= 70 && input <=79){
            
            System.out.println("C");

        }else if(input >= 60 && input <=69){

            System.out.println("D");
        }else{

            System.out.println("F");
        }
        
    }
}
