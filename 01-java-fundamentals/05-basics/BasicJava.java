import java.util.Arrays;
import java.util.ArrayList;
public class BasicJava {

    public void print255() {
        
        for (int i = 1; i <= 255; i++){
            System.out.println(i);
        }
    }

    public void odd255() {
         
        for (int i = 1; i <= 255; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public int sum255() {
        int sum = 0;
        for (int i = 1; i<= 255; i++){
            sum += i;
        }
        return sum;

    }

    public void iterateArray(int[] x) {
        // for(int name : x){
        //     System.out.println(name);
        //     // other operations using name
        // }
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

    }
    // Find Max
// Write a method (sets of instructions) that takes any array and prints the maximum value in the array. Your method should also work with a given array that has all negative numbers (e.g. [-3, -5, -7]), or even a mix of positive numbers, negative numbers and zero.
    public void maxValue(int[] x) {
        if (x.length == 0) {
            return;
        }
        int max = x[0];
        for (int i = 1; i < x.length; i++){
            if (max < x[i]) {
                max = x[i];
            }
        }
        System.out.println(max);
    }

    // Array with Odd Numbers 
    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255. When the method is done, 'y' should have the value of [1, 3, 5, 7, ... 255].

    public ArrayList<Integer> oddArray() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (int i = 1; i <= 255; i++){
            if (i % 2 != 0) {
                y.add(i);
            }
        }
        return y;
    }

//     Get Average
// Write a method that takes an array, and prints the AVERAGE of the values in the array. For example for an array [2, 10, 3], your method should print an average of 5. Again, make sure you come up with a simple base case and write instructions to solve that base case first, then test your instructions for other complicated cases.
    public void getAverage(ArrayList<Integer> list) {
        
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            sum += list.get(i);
        }
        System.out.println(sum/list.size());
        
    }

//     Greater Than Y
// Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y. For example, if array = [1, 3, 5, 7] and y = 3, after your method is run it will print 2 (since there are two values in the array that are greater than 3).
public int greaterThanY(int[] x, int y) {
    int great = 0;
    for (int i = 0; i < x.length; i++){
        if(x[i] > y){
            great++;
        }    
    }
    return great;
}

// Square the values
// Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself. When the method is done, the array x should have values that have been squared, say [1, 25, 100, 4].
public void squareValue(ArrayList<Integer> x) {
    for(int i = 0; i < x.size(); i++) {
        x.set(i, x.get(i) * x.get(i));
    }
}

// Eliminate Negative Numbers
// Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0. When the method is done, x should have no negative values, say [1, 5, 10, 0].

public void eliminateNegative(int[] noNegative) {
    for (int i = 0; i < noNegative.length; i++){
        if (noNegative[i] < 0) {
            noNegative[i] = 0;
        }
    }
    System.out.println(Arrays.toString(noNegative));
}


// Max, Min, and Average
// Given any array x, say [1, 5, 10, -2], write a method that returns an array with the maximum number in the array, the minimum value in the array, and the average of the values in the array. The returned array should be three elements long and contain: [MAXNUM, MINNUM, AVG]
public void maxMinAverage(ArrayList<Integer> list){
    int max = list.get(0);
    int min = list.get(0);
    double sum = 0;
    for (int i = 0; i <list.size(); i++) {
        if (list.get(i)> max) {
            max = list.get(i);
        }
        if (list.get(i) < min) {
            min = list.get(i);
        }
        sum += list.get(i);
    }
    double average = sum/list.size();
    System.out.println(max + min + average);
    // System.out.println(min);
    // System.out.println(average);
}
// Shifting the Values in the Array
// Given any array x, say [1, 5, 10, 7, -2], write a method that shifts each number by one to the front. For example, when the method is done, an x of [1, 5, 10, 7, -2] should become [5, 10, 7, -2, 0]. Notice that the last number is 0. The method does not need to wrap around the values shifted out of bounds.
    public void shiftArray(int[] list) {
        for(int i = 0; i <list.length-1; i++) {
            list[i] = list[i + 1];
        }
        list[list.length-1] = 0;
        System.out.println(Arrays.toString(list));
    }
}
