import java.util.Scanner;

public class LargestNumber {

    static int largestNumb(int x,int y, int z){

        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }
    public static void main(String[] args) {
        int a,b,c,largest,mes;
        
        System.out.println("Find the largest Number | Please input three numbers");
        System.out.print("First Integer : ");
        Scanner input1 = new Scanner(System.in);
        a = input1.nextInt();
        System.out.print("Second Integer : ");
        Scanner input2 = new Scanner(System.in);
        b = input2.nextInt();
        System.out.print("Third Integer : ");
        Scanner input3 = new Scanner(System.in);
        c = input3.nextInt();
        
        mes = (a==c && c==b)? 1:2;
        switch (mes){
            case 1: System.out.println("All numbers are equal");break;
            case 2: largest = largestNumb(a, b, c);
                    // Printing the largest number
                    System.out.println(largest + " is the largest number.");
                    break;
            default : 
            System.out.println("invalid entry");
            break;
        }
        

        
    }
}
