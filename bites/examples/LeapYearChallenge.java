package bites.examples;

public class LeapYearChallenge {

    private static String leapYear(Integer year) {

        if (year % 400 == 0) {
            return "True";
        }
        else if (year % 100 == 0) {
            return "False";
        }
        else if (year % 4 == 0) {
            return "True";
        }
        else {
            return "False";
        }

    }

    public static void main(String[] args) {
        System.out.println(leapYear(2000));
        System.out.println(leapYear(1970));
        System.out.println(leapYear(1900));
        System.out.println(leapYear(1988));
        System.out.println(leapYear(1500));
    }

}
