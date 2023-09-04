package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBorder, int secondBorder) {
        int sum = 0;

        if (firstBorder <= secondBorder) {
            for (int i = firstBorder; i <= secondBorder; i++) {
                sum += i;
            }
        } else {
            for (int i = secondBorder; i <= firstBorder; i++) {
                sum += i;
            }
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        RangeSum rangeSum = new RangeSum();
        int firstBorder = 5;
        int secondBorder = 10;
        rangeSum.printSumInclusive(firstBorder, secondBorder);
    }
}

