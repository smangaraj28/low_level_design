package begineer;


// n => 10 => 1 + 1 + 10 + 1 = 13
// n => 100 => 1 + 1 + 100 + 1 = 103
// n = 1M => 1 + 1 + 1M + 1 = 1M + 3 ~ 1M
public class TimeComplexity {
    public static void main(String[] args) {
        int n = 10; // constant => O(1) === O(2) === O(100) => O( constants ) // n => no of inputs / input size
        int sum = 0; // constant => O(1)
        for(int i = 1; i <= n ; i++) { // if n = 1000 ; sum+=i; will execute 1000 times
            sum += i; // O(1)
        } // n => n * O(1) => O(n)
        System.out.println(sum); // constant => O(1)

        // total T.C => const + const + n + const  = n => O(n)
        //           => O(1) + O(1) + O(n) + O(1) = O(3) + O(n) = O(n)

        int sum2 = n * (n + 1) /2; // O(1)
        System.out.println(sum2); // O(1)

        // total T.C => O(1) + O(1) = O(2) = O(1) = O(constant)

        // int i = 1; O(1)
        // i <= n O(1)
        // sum = sum + i; O(1)
        // i = i + 1; O(1)
        // i <= n O(1)
        // sum = sum + i; O(1)

//        O(1+n) = O(n)
//        O(100+n) = O(n)
//        O( n^2 + n ) = O(n^2)
//        O(n^2 + n + 1 ) = O(n^2)

//        block 1 => O(n)
//        block 2 => O(1)
//        block 3 => o(n^2)
//        Total T.C => O(n + 1 + n^2 ) = O(n^2)

//        O(n) => T.C for that program depends on the value of n
//             => T.C is directly proportional to n

//        O(n^2) => T.C for that program depends on the value of n
//               => T.C is directly proportional to n^2

//        One Problem => Efficient T.C => t1 < t2 ( Approach 1 ) else Approach 2
//      Approach 1 : Algorithm 1 ( set of instructions ) => t1
//      Approach 2 : Algorithm 2 ( set of instructions ) => t2

        // O(1million)

        // outer for loop will run for O(n)
        for(int i = 1; i <= n ; i++) {
            // inner for loop will run for O(n) for each value of i
            for(int j = 1; j <= n ; j++) { // T.C => O(n)
                System.out.println(i + j);
            }
        }

        // T.C => O(5*n) = O(n)
//        i = 1 => once => inner for loop => n times
//        i = 2 => once => inner for loop => n times
//        i = 3 => once => inner for loop => n times
//        i = n => once => inner for loop => n times
        // total time outer for loop will run => O(1+1+1+1+ n times ) = O(n)

//        Total T.C => n * O(n) = O(n*n) = O(n^2)


//        O(n) = O(n+c) = O(n-c) = O(n*c) = O(n/c) { c => Constant }
//        O(n^2) = O(n^2+c) = O(n^2-c) = O(n^2*c) = O(n^2/c)
//        O(logn) = O(logn+c)

//        2^ 5  = 32
//        2 ^ ____ = 32
//        log 32 base 2 => 5
//         32 / 2 = 16
//        16 / 2 = 8
//        8 / 2 = 4
//        4 / 2 = 2
//        2 / 2 = 1
//        1 / 2 = 0

    }

}


