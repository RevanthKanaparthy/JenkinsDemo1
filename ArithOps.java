public class ArithOps {
    public static void main(String[] args) {
        
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as arguments.");
            return;
        }

        try {
           
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

       
            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num2 != 0 ? num1 / num2 : Double.NaN; 

       
            System.out.println("Number 1: " + num1);
            System.out.println("Number 2: " + num2);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + (Double.isNaN(quotient) ? "Undefined (division by zero)" : quotient));

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
