package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        char startLetter = 'a';
        char endLetter = 'z';

        for (char letter = startLetter; letter <= endLetter; letter++) {
            System.out.println(letter);
        }
    }

    public static void main(String[] args) {
        AlphabetPrinter alphabetPrinter = new AlphabetPrinter();
        alphabetPrinter.printAlphabet();
    }
}


