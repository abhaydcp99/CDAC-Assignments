/* Composition ("Has-a" Relationship with Dependency) :-
Definition: Composition is a stronger form of aggregation where one class contains another, but the contained class cannot exist independently.

Real-Life Example:

A Human has a Heart, and if the Human dies, the Heart cannot function independently. Composition {
If the Human object is deleted, the Heart cannot exist on its own.
    
*/


class Heart {
    void beat() {
        System.out.println("Heart is beating...");
    }
}

class Human {
    private Heart heart; // Human has a Heart

    Human() {
        this.heart = new Heart(); // Strong dependency
    }

    void live() {
        heart.beat();
    }
}

public class Composition {
    public static void main(String[] args) {
        Human person = new Human();
        person.live(); // Heart beats because the human is alive
    }
}

/*Summary Table

 Concept	       Relationship Type	        Dependency	                            Example

 Association	     "Uses-a"	               No Dependency	                     Teacher - Student
Aggregation	       "Has-a" (Weak)	       Can exist independently	                 Library - Books
Composition	       "Has-a" (Strong)	       Cannot exist independently	             Human - Heart */