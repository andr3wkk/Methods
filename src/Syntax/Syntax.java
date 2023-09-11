import javax.sound.sampled.Line;
import java.util.Scanner;
public class Syntax {
    static Scanner in = new Scanner(System.in);

    //with return
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result;
        result = square(10);

        System.out.println("Squared value of 10 is: " + result);
    }

    // without return
    public static void userInfo() {
        System.out.println("This is my Syntax part of the program");
        userInfo();
    }

}