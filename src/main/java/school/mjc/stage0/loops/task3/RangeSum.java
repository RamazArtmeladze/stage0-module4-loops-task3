package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        if (firstBoarder >= secondBoarder) {
            System.out.println("firsBoarder should be less then secondBoarder");
        } else {
            for (int counter = firstBoarder; counter < secondBoarder; counter++) {
                sum += counter;
            }
            System.out.println(sum - firstBoarder);
        }

    }
    public static void main (String[]args){
        RangeSum rangeSum = new RangeSum();
        rangeSum.printSumInclusive(7, 5);
    }
}
