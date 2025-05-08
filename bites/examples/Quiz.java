package bites.examples;

public class Quiz {

    String question1;
    String question2;

    public Quiz(String testQuestion1, String question2) {
        this.question1 = testQuestion1;
        this.question2 = question2;
    }

    public String getQuestion1() {
        return this.question1;
    }

    public String getQuestion2() {
        return this.question2;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz("What is the capital of Burkina Faso?", "What is the capital of Bhutan?");
        System.out.println(quiz.getQuestion1());
        System.out.println(quiz.getQuestion2());
    }
}
