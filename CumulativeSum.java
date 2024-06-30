public class CumulativeSum {

    public static void main(String[] args) {
        // Example usage of the cumulativeSum method
        int[] results = cumulativeSum(4, 5, 10);
        
        // Printing the results
        for (int result : results) {
            System.out.println(result);
        }
    }

    public static int[] cumulativeSum(int... numbers) {
        int totalSum = 0;
        int[] results = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int currentSum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                currentSum += j;
            }
            totalSum += currentSum;
            results[i] = totalSum;
        }

        return results;
    }
}
