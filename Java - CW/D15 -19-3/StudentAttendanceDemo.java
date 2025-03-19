/*Example 1: Using ArrayList for a Student Attendance System
Scenario: Suppose a college maintains student attendance records for each lecture.
*/

import java.util.*;

class StudentAttendanceDemo {
    public static void main(String[] args) {
        List<String> attendanceList = new ArrayList<>();

        // Adding students to the attendance list
        attendanceList.add("Alice");
        attendanceList.add("Bob");
        attendanceList.add("Charlie");

        // Printing the attendance list
        System.out.println("Today's Attendance: " + attendanceList);

        // Checking if a student attended
        System.out.println("Is Bob present? " + attendanceList.contains("Bob"));
    }
}
/*Why ArrayList?

Allows dynamic resizing.
Provides fast retrieval of student names.*/


/*Today's Attendance: [Alice, Bob, Charlie]
Is Bob present? true */ 

// updated code
