package bites.examples;
import java.util.Random;

public class FizzBuzz {

    public static void main (String[] args) {

        Random rand = new Random();
        Integer number = rand.nextInt(100) + 1;

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz!");
        }
        else if (number % 3 == 0 ) {
            System.out.println("Fizz.");
        }
        else if (number % 5 == 0) {
            System.out.println("Buzz.");
        }
        else {
            System.out.println(number);
        }
        System.out.println("Number: " + number);
    }

}
