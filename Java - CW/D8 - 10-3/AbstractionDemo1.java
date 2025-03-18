
abstract class Shape{    // this is abstract class
    abstract void draw(); // abstract method : draw is an operation that we want to perform
}

class Circle extends Shape{
    void draw(){
    System.out.println("Draw: Circle");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Draw: Rectangle");
    }
}


class AbstractionDemo1 {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        s1.draw();

        Shape s2 = new Rectangle();
        s2.draw();
    }
}
