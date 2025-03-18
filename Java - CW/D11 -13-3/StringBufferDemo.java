class StringBufferDemo {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);  // Hello

        sb.append(" Duniya !!");
        System.out.println(sb);  // Hello Duniya !!
    }
}

/*Hello
  Hello Duniya !!
 */