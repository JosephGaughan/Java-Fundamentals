package bites.examples;

public class FizzBuzz2 {

    private static String play(Integer number){
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz!";
        }
        else if (number % 3 == 0 ) {
            return "Fizz.";
        }
        else if (number % 5 == 0) {
            return "Buzz.";
        }
        else {
            return String.valueOf(number);
        }
    }

    public static void main (String[] args) {

        System.out.println(play(3));
        System.out.println(play(5));
        System.out.println(play(15));
        System.out.println(play(13));

    }

}
