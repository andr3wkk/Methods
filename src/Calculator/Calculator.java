package Calculator;
import java.util.Scanner;
import java.util.StringJoiner;
public class Calculator {
    static Scanner in = new Scanner(System.in);
    static double result;
    static String start;

    public static void main(String[] args) {

        System.out.println("Welcome to the Calculculator!");

        System.out.println("Here are operations You can do:");
        System.out.println("1. + (Addition)");
        System.out.println("2. - (Subtraction)");
        System.out.println("3. * (Multiplication)");
        System.out.println("4. : (Division)");

        System.out.printf("What would you like to do?: ", 27 );
        ifMethod();
        // ----------
        System.out.println("Do You want to continue?(Please, type: Yes or No)");
        start = in.nextLine();
        while (start.equals("Yes")) {

            System.out.println("Here are operations You can do:");
            System.out.println("1. + (Addition)");
            System.out.println("2. - (Subtraction)");
            System.out.println("3. * (Multiplication)");
            System.out.println("4. : (Division)");

            System.out.print("What would you like to do?: ");
            int answer2 = in.nextInt();
            System.out.println();

            if (answer2 == 1) {
                addition2();
            } else if (answer2 == 2) {
                subtraction2();
            } else if (answer2 == 3) {
                multiplication2();
            } else if (answer2 == 4) {
                division2();
            }
        }
        System.out.println("Bye, thanks for using calculator!");
    }

    public static void addition() {

        System.out.println("Addition");

        System.out.print("First Number: ");
        double n1 = in.nextDouble();

        System.out.print("Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " + " + n2 + " = " + (n1 + n2));
        result = (n1 + n2);
    }

    public static void subtraction() {

        System.out.println("Subtraction");

        System.out.print("Input First Number: ");
        double n1 = in.nextDouble();

        System.out.print("Input Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " - " + n2 + " = " + (n1 - n2));
        result = (n1 + n2);
    }

    public static void multiplication() {

        System.out.println("Multiplication");

        System.out.print("Input First Number: ");
        double n1 = in.nextDouble();

        System.out.print("Input Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " x " + n2 + " = " + (n1 * n2));
        result = (n1 + n2);
    }

    public static void division() {

        System.out.println("Division");

        System.out.print("Input First Number: ");
        double n1 = in.nextDouble();

        System.out.print("Input Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " / " + n2 + " = " + (n1 / n2));
        result = (n1 + n2);
    }

    //----------
    public static void addition2() {

        System.out.println("Addition");

        double n1 = result;

        System.out.print("Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " + " + n2 + " = " + (n1 + n2));
    }

    public static void subtraction2() {

        System.out.println("Addition");

        double n1 = result;

        System.out.print("Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " - " + n2 + " = " + (n1 - n2));
    }

    public static void multiplication2() {

        System.out.println("Multiplication");

        double n1 = result;

        System.out.print("Input Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " x " + n2 + " = " + (n1 * n2));
    }

    public static void division2() {

        System.out.println("Division");

        double n1 = result;

        System.out.print("Input Second Number: ");
        double n2 = in.nextDouble();

        in.close();
        System.out.println("Sum: " + n1 + " / " + n2 + " = " + (n1 / n2));
        result = (n1 + n2);
    }

    public static void ifMethod() {
        int answer = in.nextInt();
        if (answer == 1) {
            addition();
        } else if (answer == 2) {
            subtraction();
        } else if (answer == 3) {
            multiplication();
        } else if (answer == 4) {
            division();
        } else {
            System.out.println("incorrect value");
        }
    }

}