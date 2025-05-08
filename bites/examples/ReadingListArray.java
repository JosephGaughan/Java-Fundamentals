package bites.examples;

public class ReadingListArray {

    String[] read = new String[3];

    public String add(String book) {
        for (Integer i = 0; i < read.length; i++) {
            if (read[i] == null) {
                read[i] = book;
                return (book + " has been added to the list.");
            }
        }
        return ("The list is full. No more books please.");
    }

    public static void main(String[] args) {
        ReadingListArray readingListArray = new ReadingListArray();
        readingListArray.read[0] = "First Book"; // Attempt to observe the for loops process.
        System.out.println(readingListArray.add("Kensuke's Kingdom"));
        System.out.println(readingListArray.add("Of Mice and Men"));
        System.out.println(readingListArray.add("Brave New World"));
        System.out.println(readingListArray.add("Book4"));
        System.out.println(readingListArray.add("Book5"));
        System.out.println(readingListArray.add("Book6"));
    }

}
