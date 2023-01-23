package pattern;

public class PatternProblem {
    public static void main(String[] args) {
        int n = 5;
        printPattern9(n);
    }
    public static void printPattern1(int n) {
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void printPattern2(int n) {

        // i = 0, 0 < 5 (T), n = 5
        // j = 0, 0 <= 0 (T) *, j = 1, 1 <= 0 (F)

        // i = 1, 1 < 5 (T), n = 5
        // j = 0, 0 <= 1 (T) * , j = 1, 1 <= 1 (T) *, j=2, 2 <= 1 (F)

        // i = 2 , 2 < 5 (T), n = 5
        for(int i = 0; i < n ; i++) {
//            // i : 0, j : 0, i : 1, j : 0,1, i: 2: j: 0,1,2
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void printPattern3(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void printPattern4(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    public static void printPattern6(int n) {
        for(int i=1; i <= n ; i++) {
            for(int j=1; j <= n-i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    public static void printPattern7(int n) {
        for(int i=0; i<n ; i++) {
            // space
            for(int j = 0;j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // star
            for(int j = 0;j < (2 * i) + 1; j++) {
                System.out.print("*");
            }
            // space
            for(int j = 0;j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void printPattern8(int n) {
        for(int i=0; i<n ; i++) {
            // space
            for(int j = 0;j < i; j++) {
                System.out.print(" ");
            }
            // star
            for(int j = 0;j < (2*n) - ( (2 * i) + 1 ); j++) {
                System.out.print("*");
            }
            // space
            for(int j = 0;j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void printPattern9(int n) {
        int star;
        for(int i = 1; i <= 2*n-1; i++) {
            star = i;
            if(i>n) {
                star = (2*n) - i;
            }
            for(int j =1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
// n = 5
// outer for loop will run for 9 times ( 2*n - 1 ) times

// i = 1 to 9 ( 1, 1, 2, 3, 4 ... )
// * => 1 => j = 1
// * * => 2 => j = 2
// * * * => 3 => j = 3
// * * * * => 4 => j = 4
// * * * * * => 5 => j = 5
// * * * * => 6 => j = (2 * n) - i = 10 - 6 = 4
// * * * => 7 => j = 10 - 7 = 3
// * * => 8 => j = 10 - 8 = 2
// * => 9 => j = 10 - 9 = 1


