import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        WordChecker wordChecker = new WordChecker();

        wordChecker.wordList.add("an");
        wordChecker.wordList.add("band");
        wordChecker.wordList.add("band");
        wordChecker.wordList.add("abandon");

        boolean isWordChain = wordChecker.isWordChain();
        System.out.println(isWordChain); /** return value */

        WordChecker wordCheckerTwo = new WordChecker();

        wordCheckerTwo.wordList.add("to");
        wordCheckerTwo.wordList.add("too");
        wordCheckerTwo.wordList.add("stool");
        wordCheckerTwo.wordList.add("tools");

        boolean isWordChainTwo = wordCheckerTwo.isWordChain();
        System.out.println(isWordChainTwo); /** return value */

    }
}