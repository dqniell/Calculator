import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, % or ^: ");
        String expression = scan.nextLine();

        if(expression.contains("*")) {
            int multiplication = expression.indexOf("*");
            String firstPart = expression.substring(0, multiplication);
            String secondPart = expression.substring(multiplication + 2);
            double first = Double.parseDouble(firstPart);
            double second = Double.parseDouble(secondPart);
            Calculator calc1 = new Calculator(first, second);
            System.out.println("Your product is: " + calc1.multiply());
        }

        if(expression.contains("/")) {
            int division = expression.indexOf("/");
            String firstPart = expression.substring(0, division);
            String secondPart = expression.substring(division + 2);
            double first = Double.parseDouble(firstPart);
            double second = Double.parseDouble(secondPart);
            Calculator calc1 = new Calculator(first, second);
            System.out.println("Your quotient is: " + calc1.divide());
        }

        if(expression.contains("+")) {
            int addition = expression.indexOf("+");
            String firstPart = expression.substring(0, addition);
            String secondPart = expression.substring(addition + 2);
            double first = Double.parseDouble(firstPart);
            double second = Double.parseDouble(secondPart);
            Calculator calc1 = new Calculator(first, second);
            System.out.println("Your sum is: " + calc1.add());
        }

        if(expression.contains("%")) {
            int mod = expression.indexOf("%");
            String firstPart = expression.substring(0, mod);
            String secondPart = expression.substring(mod + 2);
            double first = Double.parseDouble(firstPart);
            double second = Double.parseDouble(secondPart);
            Calculator calc1 = new Calculator(first, second);
            System.out.println("Your remainder is: " + calc1.mod());
        }

        if(expression.contains("-")) {
            int subtraction = expression.indexOf("-");
            String firstPart = expression.substring(0, subtraction);
            String secondPart = expression.substring(subtraction + 2);
            double first = Double.parseDouble(firstPart);
            double second = Double.parseDouble(secondPart);
            Calculator calc1 = new Calculator(first, second);
            System.out.println("Your difference is: " + calc1.subtract());

        }

        if(expression.contains("^")) {
            int exponent = expression.indexOf("^");
            String firstPart = expression.substring(0, exponent);
            String secondPart = expression.substring(exponent + 2);
            double first = Double.parseDouble(firstPart);
            double second = Double.parseDouble(secondPart);
            Calculator calc1 = new Calculator(first, second);
            System.out.println("Your answer is: " + calc1.exponent());
        }

    }
}