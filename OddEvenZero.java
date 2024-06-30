import java.util.Scanner;

public class OddEvenZero {
    public static void main(String[] args) {
        Scanner inputX = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = inputX.nextInt();
        String message;
        if (num != 0) {
            
             message = (num % 2 == 0) ? num + " is even number" : num + " is odd number";
            System.out.println(message);
            if (num > 0) {
                System.out.println("Positive Number");
            } else if (num < 0) {
                System.out.println("Negative Number");
            } 
           
        } else {
            System.out.println("You entered 0");
        }
    }
}
