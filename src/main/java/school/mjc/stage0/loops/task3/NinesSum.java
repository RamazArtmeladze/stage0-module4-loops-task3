package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        long sum = 0;

        long lastNumber = 0;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            lastNumber = lastNumber * 10 + 9;
        }

        for (long i = 9; i <= lastNumber; i = i * 10 + 9) {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        NinesSum ninesSum = new NinesSum();
        int lengthOfLastNumber = 3;
        ninesSum.calculateSum(lengthOfLastNumber);
    }
}

