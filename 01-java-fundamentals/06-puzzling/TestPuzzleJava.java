import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {

        PuzzleJava tester = new PuzzleJava();
// ArrayList<Integer> randomRolls = tester.getTenRolls();
        System.out.println(tester.getTenRolls());
        System.out.println(tester.allAlphabet());
        System.out.println(tester.randomAlphabet());
        //tester.randomAlphabet();
        System.out.println(tester.generatePassword());
        System.out.println(tester.getNewPasswordSet(4));
        ArrayList<Character> alphabet = tester.allAlphabet();
        System.out.println(alphabet);
        tester.randomArray(alphabet);
        System.out.println(alphabet);
    }
}
