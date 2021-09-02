import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
public class PuzzleJava {
    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random rand = new Random();
        int upperbound = 21;
        
        for (int i = 0 ; i < 20; i++){
            list.add(rand.nextInt(upperbound));
        }
        return list;
    }
//     getRandomLetter

// Write a method that will:

// Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
// Generate a random index between 0-25, and use it to pull a random letter out of the array.
// Return the random letter.
    // public char[] allAlphabet() {
    //     char[] alphabet = new char[26];
    //     for (char ch = 'a'; ch <= 'z'; ch++) {
    //         alphabet[ch-'a']= ch;
    //     }
    //     return alphabet;
    // }
    public ArrayList<Character> allAlphabet() {
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            alphabet.add(ch);
        }
        return alphabet;
    }
    public char randomAlphabet() {
        ArrayList<Character> alphabet = allAlphabet();
        Random rnd = new Random();
        //System.out.println((alphabet.length());
        int randomNumber = rnd.nextInt(alphabet.size());
        //System.out.println(randomNumber);
        return alphabet.get(randomNumber);
    }

//     generatePassword

// Write a method that uses the previous method to create a random string of eight characters, and return that string.
    public String generatePassword() {
        ArrayList<Character> alphabet = allAlphabet();
        Random rnd = new Random();
        String password = "";
        for (int i = 0; i <8; i++) {
            password += alphabet.get(rnd.nextInt(alphabet.size()));

        }
        return password;
    }
    // getNewPasswordSet

    // Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
    public ArrayList<String> getNewPasswordSet(int number) {
        ArrayList<Character> alphabet = allAlphabet();
        Random rnd = new Random();
        ArrayList<String> password = new ArrayList<String>();
        for (int i = 0; i < number; i++) {
            password.add(generatePassword());

        }
        return password;
    }
//     shuffleArray

// Write a method that takes an array and and mixes up all the values in a pseudo-random way. Hint: use random indexes within the array, and swap values repeatedly.
    public void randomArray(ArrayList<Character> list) {
        Collections.shuffle(list);
    }
}