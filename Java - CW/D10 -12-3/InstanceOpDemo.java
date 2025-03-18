
   // Syntax : op1 instanceof InstanceOpDemo
  // <obj name> instanceof <class name>



class A{

}

class B extends A{

}

class InstanceOpDemo {
     public static void main(String[] args) {
        
        InstanceOpDemo op1 = new InstanceOpDemo();
        A a1 = new A(); 
        B b1 = new B();
  
        // Syntax : op1 instanceof InstanceOpDemo
        // <obj name> instanceof <class name>
  
     System.out.println(op1 instanceof InstanceOpDemo); // true
     System.out.println(b1 instanceof A); //true
     System.out.println(a1 instanceof B); //false
    }    
}
