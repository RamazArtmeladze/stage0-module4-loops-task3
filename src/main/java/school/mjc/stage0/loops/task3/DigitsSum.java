package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        // Convert the number to a string
        String numStr = Integer.toString(number);

        // Initialize a variable to store the sum of digits
        int sum = 0;

        // Iterate through the string using its length
        for (int i = 0; i < numStr.length(); i++) {
            // Get each character at the current position
            char digitChar = numStr.charAt(i);

            // Convert the character back to an integer
            int digit = digitChar - '0';

            // Add the absolute value of the digit to the sum
            sum += Math.abs(digit);
        }

        // Print the sum of digits
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSum digitsSumCalculator = new DigitsSum();
        int num = -55; // Replace with your desired number
        digitsSumCalculator.printDigitsSum(num);
    }
}

