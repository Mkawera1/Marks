import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double mark1, mark2, average ;

        System.out.print("Enter any number");
        mark1 = keyboard.nextDouble();

        System.out.print("Enter second number");
        mark2 = keyboard.nextDouble();


        System.out.println("The Avg value is : " + (mark1+mark2)/2);
    }
}
