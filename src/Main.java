import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int absoluteValue;

        absoluteValue = number < 0? number * -1 : number;

        System.out.println("The absolute value of the number " + number + " is: " + absoluteValue);

    }
}