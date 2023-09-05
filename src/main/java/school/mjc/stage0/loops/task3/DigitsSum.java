package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        String numberStr = String.valueOf(number);
        int sum = 0;
        String output = "";
        for (int i = 0; i < numberStr.length(); i++) {
            char digitChar = numberStr.charAt(i);
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                sum += digit;
                if (output.isEmpty()) {
                    output += digit;
                } else {
                    output += " + " + digit;
                }
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        DigitsSum digitsSum = new DigitsSum();
        digitsSum.printDigitsSum(12345);
    }
}

