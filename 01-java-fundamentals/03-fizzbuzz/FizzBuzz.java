public class FizzBuzz {

    public String fizzBuzz(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return ("fizzBuzz");
        } else if (number % 3 == 0) {
            return ("fizz");

        } else if (number % 5 == 0) {
            return ("Buzz");
        } else {
            return (String.valueOf(number));
        }
    }

    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word) {

        if (number % 3 == 0 && number % 5 == 0) {
            return multOf15Word;
        } else if (number % 3 == 0) {
            return multOf3Word;

        } else if (number % 5 == 0) {
            return multOf5Word;
        } else {
            return (String.valueOf(number));
        }
    }
}