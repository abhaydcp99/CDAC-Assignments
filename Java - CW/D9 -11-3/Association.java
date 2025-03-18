/*Association (General Relationship) : -

Definition: Association is a relationship where two classes are related but can exist independently. It represents a "uses-a" relationship.

Real-Life Example:

A teacher and a student have an association, but they can exist separately. */


class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class Association {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith");
        Student student = new Student("Alice");

        System.out.println(teacher.name + " teaches " + student.name);
    }
}




/*Summary Table

 Concept	       Relationship Type	        Dependency	                            Example

 Association	     "Uses-a"	               No Dependency	                     Teacher - Student
Aggregation	       "Has-a" (Weak)	       Can exist independently	                 Library - Books
Composition	       "Has-a" (Strong)	       Cannot exist independently	             Human - Heart */


/*
                           associaton 
                               |              
                 |                                |
 */