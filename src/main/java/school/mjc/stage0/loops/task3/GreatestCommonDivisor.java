package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public int calculateGCD(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

    public void printGCD(int first, int second) {
        int gcd = calculateGCD(first, second);
        System.out.println(gcd);
    }

    public static void main(String[] args) {
        GreatestCommonDivisor gcdCalculator = new GreatestCommonDivisor();
        int num1 = 48;
        int num2 = 18;
        gcdCalculator.printGCD(num1, num2);
    }
}

