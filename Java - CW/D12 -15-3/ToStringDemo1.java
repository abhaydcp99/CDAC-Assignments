class ToStringDemo1 {
    String name;
    int id;

    ToStringDemo1(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override                   // done overriding with toString() of object class
    public String toString(){
        return name+ " " +id;   // return String values of id and name
    }

    public static void main(String[] args) {
        ToStringDemo1 t1 = new ToStringDemo1("Abhay", 111);
        System.out.println(t1);     // by default toString method is called

    }

}
