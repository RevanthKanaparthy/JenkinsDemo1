public class ReverseNumber {
    public static void main(String[] args) {
        // Check if an argument is passed
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        // Parse the input number from command-line arguments
        int number = Integer.parseInt(args[0]);

        // Variable to store the reversed number
        int reversed = 0;

        // Loop to reverse the number
        while (number != 0) {
            int digit = number % 10;   // Get the last digit
            reversed = reversed * 10 + digit; // Shift the digits and add the last digit
            number = number / 10;      // Remove the last digit
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);
    }
}
