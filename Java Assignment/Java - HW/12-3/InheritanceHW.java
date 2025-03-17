class Flower {
    String name;
    String color;
    boolean hasFragrance;

    public Flower(String name, String color, boolean hasFragrance) {
        this.name = name;
        this.color = color;
        this.hasFragrance = hasFragrance;
    }

    public void displayDetails() {
        System.out.println("Flower Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Has Fragrance: " + (hasFragrance ? "Yes" : "No"));
    }
}

class Rose extends Flower {
    boolean hasThorns;

    public Rose(String color, boolean hasFragrance, boolean hasThorns) {
        super("Rose", color, hasFragrance);
        this.hasThorns = hasThorns;
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Rose Details ----");
        super.displayDetails();
        System.out.println("Has Thorns: " + (hasThorns ? "Yes" : "No"));
        System.out.println();
    }
}

class Lily extends Flower {
    boolean isWaterPlant;

    public Lily(String color, boolean hasFragrance, boolean isWaterPlant) {
        super("Lily", color, hasFragrance);
        this.isWaterPlant = isWaterPlant;
    }

    @Override
    public void displayDetails() {
        System.out.println("---- Lily Details ----");
        super.displayDetails();
        System.out.println("Grows in Water: " + (isWaterPlant ? "Yes" : "No"));
        System.out.println();
    }
}

public class InheritanceHW {
    public static void main(String[] args) {
        Rose rose = new Rose("Red", true, true);
        Lily lily = new Lily("White", true, true);
        
        rose.displayDetails();
        lily.displayDetails();
    }
}
