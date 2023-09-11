//program start
//initialize variable name
//start a loop
//initialize variable genre
//initilize variable age
//if genre = ...; age = ... -> print ...
//input yes or no for continuing
//if answer = yes -> repeat loop
//if answer = no -> program stop

import java.util.Scanner;
import java.util.StringJoiner;
public class Main {
    static Scanner in = new Scanner(System.in);
    static String name;
    static int age;
    static String start;

    public static void main(String[] args) {

        String name = getUserInfo("Welcome to the Film Recommender! What is Your name?");

        do {

            String genre = getUserInfo("What is Your favourite film genre?");
            System.out.println("Please, type Your age");
            age = in.nextInt();

            System.out.println("You should really check out:");

            if (genre.equals("Action")) {
                Action();
            }
            else if (genre.equals("Comedy")) {
                Comedy();
            }
            else if (genre.equals("Drama")) {
                Drama();
            }
            else if (genre.equals("Fantasy")) {
                Drama();
            }
            else if (genre.equals("Horror")) {
                Horror();
            }
            else if (genre.equals("Romance")) {
                Romance();
            }
            else if (genre.equals("Thriller")) {
                Thriller();
            }
            System.out.println();
            System.out.println("Your info list: "+ "Name: " + name + "; Age: " + age + "; Favorite Genre: " + genre);
            System.out.println();
            in.nextLine();
            YesNo();
        } while (start.equals("Yes"));
        System.out.println();
        System.out.println("Bye, thanks for using film recommender!");
    }
    public static void Action() {
        if (age >= 10) {
            System.out.println("1) The Matrix (1999); 2) Mad Max: Fury Road; 3) The Dark Knight");
        } else if (age < 10) {
            System.out.println("1) Spider-Man: Into the Spider-Verse; 2) The Karate Kid; 3) The Maze Runner");
        }
    }
    public static void Comedy() {
        if (age >= 10) {
            System.out.println("1) The Big Lebowski; 2) Yes Man; 3) Airplane!");
        } else if (age < 10) {
            System.out.println("1) Despicable Me; 2) Paddington; 3) Home Alone");
        }
    }
    public static void Drama() {
        if (age >= 10) {
            System.out.println("1) Moonlight; 2) Parasite; 3) Dunkirk");
        } else if (age < 10) {
            System.out.println("1) Life of Pi; 2) The Jungle Book; 3) Hugo");
        }
    }
    public static void Fantasy() {
        if (age >= 10) {
            System.out.println("1) Star Wars; 2) Lord of the Rings; 3) Edward Scissorhands");
        } else if (age < 10) {
            System.out.println("1) Harry Potter; 2) Willy Wonka and the Chocolate Factory; 3) The Wizard of Oz");
        }
    }
    public static void Horror() {
        if (age >= 10) {
            System.out.println("1) The Conjuring; 2) The Exorcist; 3) Sinister");
        } else if (age < 10) {
            System.out.println("You shouldn't really watch this stuff fot now(((");
        }
    }
    public static void Romance() {
        if (age >= 10) {
            System.out.println("1) Twilight; 2) Titanik; 3) Before Sunrise");
        } else if (age < 10) {
            System.out.println("1) Beauty and the Beast; 2) Cinderella; 3) Ever After");
        }
    }
    public static void Thriller() {
        if (age >= 10) {
            System.out.println("1) Silence of the Lambs; 2) Memento; Shining");
        } else if (age < 10) {
            System.out.println("You shouldn't really watch this stuff fot now(((");
        }
    }
    public static void YesNo() {
        start = getUserInfo("Do You want to continue?");
    }
    public static String getUserInfo (String caption) {
        System.out.println(caption);
        String x = in.nextLine();
        return x;

    }
}