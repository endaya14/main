public class SwapTwoVariables {
    public static void main(String[] args) {
        int valOne = 100, valTwo = 200;
        //System.out.println("Value of valOne = 200 and value of valTwo = 100");
        System.out.println("Value before swapping");
        System.out.println("Variable 1 = " + valOne);
        System.out.println("Variable 2 = " + valTwo);
        
        swapVal(valOne, valTwo);
    }
    static void swapVal(int valOne, int valTwo)
    {
        // Swapping the values
        int temp = valOne;
        valOne = valTwo;
        valTwo = temp;
        System.out.println("Value of Variable 1 is " + valOne + " and Value of Variable 2 is " + valTwo);
    }   
}
