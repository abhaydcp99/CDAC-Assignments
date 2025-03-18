class ToStringDemo {
    String brand;
    
    ToStringDemo(String brand) {
        this.brand = brand;
    }
    
    @Override
    public String toString() {
        return "Car brand: " + brand;
    }
}

class main {
    public static void main(String[] args) {
        ToStringDemo car = new ToStringDemo("Toyota");
        System.out.println(car.toString()); // Outputs: Car brand: Toyota
    }
}
