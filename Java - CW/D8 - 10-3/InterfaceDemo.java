interface Animal{
    void sound(); // abs method
}                // its method where we hides information

// to implement animal to interface
// use implement keyword always to perform it

class Dog implements Animal {
     public void sound(){
             System.out.println("Dog barks : sound");
          }
    
}

class InterfaceDemo {
        public static void main(String[] args) {
           Animal a = new Dog();
           a.sound(); 
        }    
}
