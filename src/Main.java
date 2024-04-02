import javax.xml.transform.Result;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            int operand1 = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number:");
            if (scanner.hasNextInt()) {
                operand1 = scanner.nextInt();
            } else if (scanner.hasNext("s")) {
                char operation = scanner.next().charAt(0);
                System.out.println("The operation is completed!");
                break;
            }
            System.out.println("Action:");
            String result = scanner.nextLine();
            result = scanner.nextLine();
            System.out.println("Enter the second number:");
            int operand2 = scanner.nextInt();
            switch (result) {
                case ("+"):
                    int res1 = operand1 + operand2;
                    System.out.println("Result:" + res1);
                    break;
                case ("-"):
                    int res2 = operand1 - operand2;
                    System.out.println("Result:" + res2);
                    break;
                case ("*"):
                    int res3 = operand1 * operand2;
                    System.out.println("Result:" + res3);
                    break;
                case ("/"):
                    float res4 = (float) operand1 / operand2;
                    System.out.println("Result:" + res4);
                    break;
                default:
            }
        }
    }
}