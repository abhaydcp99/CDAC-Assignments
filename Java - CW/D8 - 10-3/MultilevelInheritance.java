
class Animal  {
      void display(){
        System.out.println("Parent class: P1");
      }

      class Dog extends Animal{
        void childDisplay(){
            System.out.println("Child class: C1");
        }

       class Babydog extends Animal{
        void babyDisplay(){
            System.out.println("BabyChild class : BC1");
        }
       }
    }
    
}


class MultilevelInheritance {

      public static void main(String[] args) {

        // methods access from parent class -----
        Babydog b1 = new Babydog();
        b1.babyDisplay();
        b1.childDisplay();
        b1.display();

        // access instance variable from parent classes :
        System.out.println(b1.id);
        System.out.println(b1.id);
        System.out.println(b1.id);
      }    
}
