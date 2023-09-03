package school.mjc.stage0.loops.task3;

public class NinesSum {
    public int calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber < 1) {

            return 0;
        }

        int sum = 0;
        int term = 9;
        int multiplier = 1;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            sum += term;
            term = term + 9 * multiplier;
            multiplier *= 10;
        }

        return sum;
    }

    public void displaySum(int lengthOfLastNumber) {
        int sum = calculateSum(lengthOfLastNumber);
        System.out.println( sum);
    }

    public static void main(String[] args) {
        NinesSum ninesSumCalculator = new NinesSum();
        int lengthOfLastNumber = 3;
        ninesSumCalculator.displaySum(lengthOfLastNumber);
    }
}

