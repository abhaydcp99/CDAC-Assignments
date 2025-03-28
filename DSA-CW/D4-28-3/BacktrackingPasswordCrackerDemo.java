class BacktrackingPasswordCrackerDemo {
    static int[] correctPin = {2, 5, 7, 9}; // Original PIN
    static int[] attempt = new int[4]; // Store guessed PIN

    // Function to check if guessed PIN matches correct PIN
    static boolean isCorrect() {
        for (int i = 0; i < 4; i++) {
            if (attempt[i] != correctPin[i])
                return false;
        }
        return true;
    }

    // Backtracking function to guess PIN
    static boolean crackPin(int position) {
        if (position == 4) { // If all 4 digits are filled
            if (isCorrect()) {
                System.out.print("PIN Cracked: ");
                for (int num : attempt) {
                    System.out.print(num);
                }
                System.out.println();
                return true; // Stop when PIN is found
            }
            return false;
        }

        for (int num = 0; num <= 9; num++) { // Try digits 0-9
            attempt[position] = num; // Set digit

            if (crackPin(position + 1)) // Recurse for next position
                return true;

            // Backtrack: Undo last change (not needed here but for understanding)
            attempt[position] = -1; 
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Cracking PIN...");
        crackPin(0);
    }
}

