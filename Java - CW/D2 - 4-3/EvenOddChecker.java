public class EvenOddChecker {
    public static void main(String[] args) {
        // Check if command-line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        try {
            // Convert the first command-line argument to an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is even or odd
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
    }
}
