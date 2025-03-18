class Finally {
    public static void main(String[] args) {
        
        try {
            int k = 1/0;
        } catch (Exception e) {
            System.out.println("Exception aagayaaaaaaa !!!!");
        }
        finally{
            System.out.println("Finally");
        }
    }    
}


/*
Exception aagayaaaaaaa !!!!
Finally
 */