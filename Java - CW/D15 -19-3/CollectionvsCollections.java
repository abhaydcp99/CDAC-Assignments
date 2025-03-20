import java.util.*;

class CollectionvsCollectionsDemo {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(); // Using Collection Interface
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        System.out.println("Original Collection: " + numbers);

        List<Integer> numberList = new ArrayList<>(numbers);
        Collections.sort(numberList); // Using Collections Class
        System.out.println("Sorted Collection: " + numberList);
    }
}

/*
 Original Collection: [5, 2, 8, 1]
Sorted Collection: [1, 2, 5, 8]

 */