class EqualsDemo {
    String name;

    EqualsDemo(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        EqualsDemo person = (EqualsDemo) obj;
        return name.equals(person.name);
    }
}

class Main {
    public static void main(String[] args) {
        EqualsDemo p1 = new EqualsDemo("Alice");
        EqualsDemo p2 = new EqualsDemo("Alice");

        System.out.println(p1.equals(p2)); // Outputs: true
    }
}
