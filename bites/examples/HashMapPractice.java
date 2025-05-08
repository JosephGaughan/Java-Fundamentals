package bites.examples;

import java.util.HashMap;

public class HashMapPractice {

    HashMap<String, Integer> menu = new HashMap<String, Integer>();

    public static void main(String[] args) {

        HashMapPractice hashMapPractice = new HashMapPractice();
        hashMapPractice.menu.put("huel", 2);
        hashMapPractice.menu.put("coffee", 1);
        hashMapPractice.menu.put("coffee", 2);
        System.out.println(hashMapPractice.menu.get("huel"));
        hashMapPractice.menu.remove("huel"); // "huel is no longer in the HashMap, so the output is null from now on.
        System.out.println(hashMapPractice.menu.get("huel"));

    }

}
