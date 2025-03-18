public class ReverseNumber {
    public static void main(String[] args) {
        // Get the number from command-line arguments or Jenkins environment variables
        String numberStr = System.getenv("NUMBER_TO_REVERSE");

        if (numberStr == null || numberStr.isEmpty()) {
            System.out.println("Please provide a number.");
            return;
        }

        int number = Integer.parseInt(numberStr);
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
