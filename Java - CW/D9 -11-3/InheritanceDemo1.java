
class Parent{
    int x = 10;
} 


class Child extends Parent{
    int y=20;
    Abc a2;                          // ref of Abc class
}

class Abc{

}


class InheritanceDemo1{
    public static void main(String args[]){
        Child c = new Child(); // ref for child class
        Abc a = new Abc(); // ref for Abc class
        Abc a1;
    }
}  
