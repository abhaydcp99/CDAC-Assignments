class PermutationDemo{
    static void display(String str, String res){
        if(str.length()==0){
            System.out.println(res+"");
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);      // ye first element ko uthayega
            String ros = str.substring(0,i)+str.substring(i+1);                  // main line -- ABC ---> A|BC ---> AB|C
            display(ros,res+ch);
        }                                                      
    }

    public static void main (String [] args){
        String s = "ABC";
        display(s,"");
    }
}

/*
ABC
ACB
BAC
BCA
CAB
CBA
 */