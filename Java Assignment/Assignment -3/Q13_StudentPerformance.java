import java.util.*;

public class Q13_StudentPerformance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define number of students
        int students = 20;
        
        // Counters for student categories
        int above75Count = 0, below40Count = 0;

        // Read marks for each student
        for (int i = 0; i < students; i++) {
            int physics = scanner.nextInt();
            int chemistry = scanner.nextInt();
            int maths = scanner.nextInt();

            // Calculate aggregate percentage
            int totalMarks = physics + chemistry + maths;
            double percentage = (totalMarks / 300.0) * 100;

            // Update counts
            if (percentage >= 75) {
                above75Count++;
            } else if (percentage <= 40) {
                below40Count++;
            }
        }

        scanner.close();

        // Print results
        System.out.println("Students securing 75% and above: " + above75Count);
        System.out.println("Students securing 40% and below: " + below40Count);
    }
}
