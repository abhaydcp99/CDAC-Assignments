class CombineStringBuilderBufferDemo {
    public static void main(String[] args) {
        

        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);  // Hello
        sb.append(" Duniya !!");
        System.out.println(sb);  // Hello Duniya !!



        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append("  <<<<<<<<< CDAC >>>>>>>>");
        System.out.println(sb1);


    }
}

// Hello  <<<<<<<<< CDAC >>>>>>>>