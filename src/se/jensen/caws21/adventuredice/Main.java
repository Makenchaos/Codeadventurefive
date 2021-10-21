package se.jensen.caws21.adventuredice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> Movies = new ArrayList<>();

    public static void main(String[] args) {

        printMenu();


    }

    public static void printMenu() {

        boolean programRunning = true;

        System.out.println("***** Menu *****");
        while (programRunning) {


            System.out.println("1. Add new movie");
            System.out.println("2. Edit list");
            System.out.println("3. Show entire list");
            System.out.println("4. Delete movies from list");
            System.out.println("5. End program");
            System.out.print(">");
            int userInput = getUserInt();
            switch (userInput) {
                case 1 -> addMovie();
                case 2 -> editList();
                case 3 -> showList();
                case 4 -> deleteMovies();
                case 5 -> programRunning = false;
                default -> System.out.println("Sorry wrong input.");
            }


        }
    }

    public static String getUserString() {
        Scanner getUserString = new Scanner(System.in);


        return getUserString.nextLine();

    }

    public static int getUserInt() {
        Scanner getUserInt = new Scanner(System.in);


        return getUserInt.nextInt();

    }

    public static void addMovie() {


        System.out.println("You choose add movie");
        System.out.print(">");
        String callFor = getUserString();
        Movies.add(callFor);


    }

    public static void editList() {
        System.out.println("Move your movie to selected position");
        System.out.print(">");
        int edit1 = getUserInt();
        System.out.print(">");
        String edit2 = getUserString();
        Movies.set(edit1, edit2);

        showList();

    }

    public static void showList() {
        System.out.println("Show List");
        for (int i = 0; i < Movies.size(); i++) {
            System.out.println(Movies.get(i));
        }


    }

    public static void deleteMovies() {

        for (int i = 0; i < Movies.size(); i++) {
            System.out.println("(" + i + ")" + Movies.get(i));
        }
        System.out.println("Choose movie to delete from list");
        System.out.print(">");

        int remove = getUserInt();
        Movies.remove(remove);
    }
}








