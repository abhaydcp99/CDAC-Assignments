//Tower Of Hanoi

// line 5 to 15 is recursive function of TOH

class TowerOfHanoi {
    static void toh(int n, char s, char inter, char d) {
        if (n == 1) {
            System.out.println("Disk from " + s + "to" + d);
        } else {
            toh(n - 1, s, d, inter);
            System.out.println("Disk from " + s + "to" + d);
            toh(n - 1, inter, s, d);
        }
    }

    public static void main(String[] args) {
        int n = 3;                                  // Try 4,5,n disks
        toh(n, 'A', 'B', 'C');
    }
}

/*
 Disk from AtoC
Disk from AtoB
Disk from CtoB
Disk from AtoC
Disk from BtoA
Disk from BtoC
Disk from AtoC
 */