package bites.examples;
import java.util.ArrayList;

public class Sandbox {

    ArrayList<String> contentsOfMyPocket = new ArrayList<String>();
    String[] my5FavouriteAnimals = {"Chameleon", "Orca", "Octopus", "Hedgehog", "Kingfisher"};


    public Sandbox() {
        contentsOfMyPocket.add("keys");
        contentsOfMyPocket.add("phone");
        contentsOfMyPocket.add("wallet");


    }

    public static void main(String[] args) {

        Sandbox sandbox = new Sandbox();

        for (String item : sandbox.contentsOfMyPocket) {
            System.out.println(item);
        }

        for (Integer i = 1; i < sandbox.my5FavouriteAnimals.length + 1; i++) {
            System.out.println("Animal " + i + ": " + sandbox.my5FavouriteAnimals[i - 1]);
        }
    }
}
