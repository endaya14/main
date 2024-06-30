public class OddOrEven{

public static void main(String[] args) {
    int check_number = 10;
    String message;
    
    for(int y = 1;y<=check_number;y++){
       message = (y%2==0)? y +  " is even number": y + " is odd number";
       System.out.println(message);
    }
}

}