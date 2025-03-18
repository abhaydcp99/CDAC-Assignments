class HashCodeDemo {
    String name;

    HashCodeDemo(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class Main {
    public static void main(String[] args) {
        HashCodeDemo s1 = new HashCodeDemo("John");
        HashCodeDemo s2 = new HashCodeDemo("John");

        System.out.println(s1.hashCode()); // Outputs a hashcode
        System.out.println(s2.hashCode()); // Outputs the same hashcode
    }
}
