class ArithmeticTask {

    public static void main (String[] args){
          
        int compoundAssignment = 1 + 2; // compoundAssignment is now 3
        System.out.println(compoundAssignment);

        compoundAssignment = compoundAssignment - 1; // compoundAssignment is now 2
        System.out.println(compoundAssignment);

        compoundAssignment = compoundAssignment * 2; // compoundAssignment is now 4
        System.out.println(compoundAssignment);

        compoundAssignment = compoundAssignment / 2; // compoundAssignment is now 2
        System.out.println(compoundAssignment);

        compoundAssignment = compoundAssignment + 8; // compoundAssignment is now 10
        compoundAssignment = compoundAssignment % 7; // compoundAssignment is now 3
        System.out.println(compoundAssignment);

    }
}