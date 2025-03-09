import java.util.*; // * = library imported bcz scanner  

public class Q1_FindMinMax11 {           // class name
    public static void main(String[] args) {            // main method
        Scanner scanner = new Scanner(System.in);       // user input i.e System.in


        // Read the size of the array
        System.out.println("Enter length array : ");  // WHAT WE WANT USER OUTOUT
        int n = scanner.nextInt();                      // WE WANT INTEGER THATS WHY USED INT // .NEXT = SINGLE CHAR : A // NEXTLINE = WHOLE WORD : ABHAHY // STRING = WHOLE LINE
        int[] arr = new int[n];                         // ARRAY DECLARED [N] = SIZE


        // Read array elements
        for (int i = 0; i < n; i++) {          // I = 0 DENOTES WHERE IT STARTS FROM  // I < N = DENOTES KUTH PARYANT CHALNAR I.E [N=5] TR 5 PARYANT // I++ = I CHI VALUE INCREASES AFTER ONE ITERATION 0 - 1 - 2 -3
            System.out.println("Enter number : " + i);
            arr[i] = scanner.nextInt();         // TAKE USERS INPUT I.E  PAHILE I = 0 TR NNTR AAPAN AAPN VALUE DENAR 0 CHI
        }

        scanner.close();      // OPTIONAL ENDS SCANNER 

        // Initialize min and max with the first element
        int min = arr[0];            // MIN VAL = 0 FOR START
        int max = arr[0];            // MAX VAL = 

        // Loop through the array to find min and max
        for (int i = 1; i < n; i++) {                          // START FROM 1 BCZ : 0 CHI VALUE ADHICH DILI AAHE PAHILYA ARRAY MDHE
            if (arr[i] < min) {             //HERE MIN MDHE 0 CHI VALUE Y AANI I MDHE 1 CHI VALUE TR TO CHECK KRNR CHOTA KON
                min = arr[i]; //10
            }
            if (arr[i] > max) {          // HERE MOTHA KON :  10= MIN  ,25 = I = (1)CHI VALUE   15 12 20
                max = arr[i];       // 25
            }
        }
        // IT RUNS 5 TIMES BCZ WE GIVEN N =5  I = 5 UNTIL IT GETS SATISFIED

        // Print the results
        System.out.println("Smallest Element: " + min);
        System.out.println("Largest Element: " + max);
    }
}
