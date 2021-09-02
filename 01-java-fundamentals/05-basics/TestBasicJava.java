import java.util.*;

public class TestBasicJava {
    public static void main (String[] args) {
        BasicJava tester = new BasicJava();
        tester.print255();
        tester.odd255();
        System.out.println(tester.sum255());
        tester.iterateArray(new int[] {1,3,5,7,9,13});
        tester.maxValue(new int[] {1,13,15,-7,0,9,13});
        System.out.println(tester.oddArray());
        //for averagemethod
        ArrayList<Integer> average = new ArrayList<>(Arrays.asList(1,2,3,4,1)); //this is a way to instiate a array
        tester.getAverage(average);

        System.out.println(tester.greaterThanY(new int[] {1,3,5,7,9,13} , 0));

        //for squareValue method
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1,2,3,4,1));
        System.out.println(y);
        tester.squareValue(y);
        System.out.println(y);

        // tester.eliminateNegative(new int[] {1,3,-5,7,9,-13});
        ArrayList<Integer> math = new ArrayList<>(Arrays.asList(1, 5, 10, -2));
        tester.maxMinAverage(math);
        tester.shiftArray(new int[] {1,3,5,7,9,13});

    }


}


