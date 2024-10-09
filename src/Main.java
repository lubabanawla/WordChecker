import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        WordChecker wordChecker = new WordChecker();

        wordChecker.wordList.add("to");
        wordChecker.wordList.add("too");
        wordChecker.wordList.add("stool");
        wordChecker.wordList.add("tools");

        boolean isWordChain = wordChecker.isWordChain();
        System.out.println(isWordChain); /** return value */

    }
}