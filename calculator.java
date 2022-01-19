import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose an operation (1-4):\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division");
        String response = scan.nextLine();

            //for addition
        if (response.equals("1")) {
            System.out.println("Type your first number");
            double x = scan.nextDouble();
            System.out.println("Type your second number");
            double y = scan.nextDouble();
            System.out.println(x + y);
            //for subtraction
        } else if (response.equals("2")) {
            System.out.println("Type your first number");
            double x = scan.nextDouble();
            System.out.println("Type your second number");
            double y = scan.nextDouble();
            System.out.println(x - y);
            //for multiplication
        } else if (response.equals("3")) {
            System.out.println("Type your first number");
            double x = scan.nextDouble();
            System.out.println("Type your second number");
            double y = scan.nextDouble();
            System.out.println(x * y);
            //for division
        } else if (response.equals("4")) {
            System.out.println("Type your first number");
            double x = scan.nextDouble();
            System.out.println("Type your second number");
            double y = scan.nextDouble();
            System.out.println(x / y);
        }
System.out.println("Thank you for using this calculator, goodbye :)");
    }
}