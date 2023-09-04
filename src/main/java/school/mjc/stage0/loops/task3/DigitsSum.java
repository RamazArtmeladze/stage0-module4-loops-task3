package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public int calculateDigitsSum(int number) {
        String numStr = Integer.toString(number);

        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);

            int digit = digitChar - '0';
            sum += digit;
        }

        return sum;
    }

    public void printDigitsSum(int number) {
        int sum = calculateDigitsSum(number);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSum digitsSumCalculator = new DigitsSum();
        int num = 123457;
        digitsSumCalculator.printDigitsSum(num);
    }
}

