class Animal{
    void eat (){
        System.out.println("Parent class: Eat()");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Child class: Bark()");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Child class2: Sound()");
    }
}



class HiererchichalInheritance {
    public static void main(String[] args) {
         Cat c1 = new Cat();
         c1.eat();
         c1.sound();


         Dog c11 = new Dog();
         c11.eat();
         c11.bark();

    }
    
}
