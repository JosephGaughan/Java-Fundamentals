package bites.examples;

public class Announcement {
    public static void celebration(String message) {
        System.out.println(message);
    }

    public void changeOfPlan(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Announcement.celebration("Woohoo!");
        Announcement myAnnouncement = new Announcement();
        myAnnouncement.changeOfPlan("Plan B!");
    }
}
