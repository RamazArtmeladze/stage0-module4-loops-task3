package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBorder, int secondBorder) {
        int sum = 0;

        if (firstBorder == 0 && secondBorder == 0) {
            sum = 0;
        } else if (firstBorder <= secondBorder) {
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
        int firstBorder = 50;
        int secondBorder = 50;
        rangeSum.printSumInclusive(firstBorder, secondBorder);
    }
}


