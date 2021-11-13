import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double a, b, result;              //User can enter double as well as integer value
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = scan.nextDouble();
        System.out.println("Enter the second number");
        b = scan.nextDouble();
        System.out.println("Select an Operator(+,-,*,/):");
        char operator = scan.next().charAt(0); //User can select the operator

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Wrong operator entered");
                return;

        }
     System.out.println(a+""+operator+" "+b+"; "+result);

    }

}
