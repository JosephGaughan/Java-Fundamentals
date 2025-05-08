package bites.examples;

import java.util.ArrayList;

public class ReadingList {

    ArrayList<String> unread = new ArrayList<String>();

    public void add(String book) {
        unread.add(book);
    }

    public static void main(String[] args) {
        ReadingList readingList = new ReadingList();
        readingList.add("Kensuke's Kingdom");
        readingList.add("Of Mice and Men");
        readingList.add("Brave New World");

        for (String book : readingList.unread) {
            System.out.println(book);
        }
    }


}
