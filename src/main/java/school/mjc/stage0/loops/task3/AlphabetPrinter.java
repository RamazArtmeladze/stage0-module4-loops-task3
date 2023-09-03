package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char startChar = 'A';
        char endChar = 'Z';

        for (char counter = startChar; counter <= endChar; counter++) {
            System.out.print(counter + " ");
        }
    }

    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
}

