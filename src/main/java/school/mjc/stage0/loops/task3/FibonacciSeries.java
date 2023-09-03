package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int n1 = 0, n2 = 1, nextTerm;

        for (int i = 1; i <= lastFibonacci; i++) {
            if (i == 1) {
                System.out.println(n1);
                continue;
            }
            if (i == 2) {
                System.out.println(n2);
                continue;
            }

            nextTerm = n1 + n2;
            System.out.println(nextTerm);
            n1 = n2;
            n2 = nextTerm;
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        int n = 10;
        fibonacciSeries.printFibonacci(n);
    }
}

