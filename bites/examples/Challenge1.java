package bites.examples;

public class Challenge1 {
    public static void main(String[] args) {
        System.out.println("=== Java Command Line Arguments Demo ===");
        System.out.println("You passed " + args.length + " argument(s).");

        if (args.length > 0) {
            System.out.println("Here are the arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No arguments were provided.");
        }
    }
}
