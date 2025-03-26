// RECURSION INFINITE LOOP :
class Recursion{
    static int i=0;
    static void show(){
        i++;             // ye kaha likh rahe ho bahot matter karta hai output pe 👉 Each time show() is called, i increases by 1.


        if(i<=5)  // base condition
        {
            System.out.println("Hii boys...!!!");
            show();        // RECURSIVE CALL

        }
    }
    public static void main(String [] args){
          show();
    }
}

/*
Hii boys...!!!
Hii boys...!!!
Hii boys...!!!
Hii boys...!!!
Hii boys...!!! */


/*
 📌 Execution Flow (Step-by-Step) :

    Call	          i Value    Condition i <= 5?   	          Output
show() (1st call)	1	       ✅ Yes	             "Hii boys...!!!"
show() (2nd call)	2          ✅ Yes	              "Hii boys...!!!"
show() (3rd call)	3	       ✅ Yes	              "Hii boys...!!!"
show() (4th call)	4	       ✅ Yes	              "Hii boys...!!!"
show() (5th call)	5	       ✅ Yes	              "Hii boys...!!!"
show() (6th call)	6	       ❌ No	                   Stops recursion
 */