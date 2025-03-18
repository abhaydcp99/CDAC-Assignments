class HashCodeDemo1 {
    String name;
    int id;

    HashCodeDemo1(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override                   // done overriding with toString() of object class
    public int hashCode(){
        return id;   // using id as unique hash code must be return
    }

    public static void main(String[] args) {
        HashCodeDemo1 t1 = new HashCodeDemo1("Abhay", 111);
        System.out.println(t1.hashCode());     // by default toString method is called

    }

}

