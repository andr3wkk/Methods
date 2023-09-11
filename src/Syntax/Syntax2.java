package Syntax;
import java.util.Scanner;
public class Syntax2 {
    static Scanner in = new Scanner(System.in);
    static String name;
    static String output;

    public static void main(String[] args) {

        System.out.println();
        MyMethod();
    }
    public static void MyMethod() {
        output = myMethod2("Hello! This is a Syntax part of my project.");
    }

    public static String myMethod2 (String caption) {
        System.out.println(caption);
        String x = in.nextLine();
        return x;
    }

}