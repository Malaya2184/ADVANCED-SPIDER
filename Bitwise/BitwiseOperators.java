

public class BitwiseOperators {
    public static void main(String[] args) {
        
        // bit wise and opeartor
        System.out.print("this is the example that how and(&) operator works : -");
        System.out.println("21 & 6 =" + (21 & 6));
        System.out.print("this is the example that how and(&&) operator works");
        // System.out.println(21 && 6);
    }
}


// Binary Number System
// The numbers are stored in their binary representation in computers and every single digit 0 / 1 is called bit. Most languages allow you to perform operations which are bitwise ( this statement will make much more sense when we look at the operator themselves ). It is a fast, primitive action directly supported by the processor, and is used to manipulate values for comparisons and calculations.
// Bitwise AND
// Syntax
//  A & B

// Values for bit combinations
//             a      b        a & b 
//            ------------------------
//             0      0         0
//             0      1         0
//             1      0         0
//             1      1         1
// In other words, a & b = 0 unless a = 1 and b = 1.



// What does A & B mean ?
// A & B implies a & b for all corresponding bits of A and B.
// So, lets say,

//        A = 21 (10101) and B = 6  (110) 
//        A & B = 
//                         1 0 1 0 1
//                     &   0 0 1 1 0  
//                     ------------------
//                         0 0 1 0 0  =  4.

// Bitwise OR
// Syntax
//     A | B


// Values for bit combinations
//             a      b      a | b 
//            ------------------------
//             0      0         0
//             0      1         1
//             1      0         1
//             1      1         1
// In other words, a | b = 1 unless a = 0 and b = 0.


// What does A | B mean ?
// A | B  implies a | b for all corresponding bits of A and B. So, lets say

//        A = 21 ( 10101 ) and B = 6  ( 110 ) 
//        A | B = 
//                         1 0 1 0 1
//                     |   0 0 1 1 0  
//                     ------------------
//                         1 0 1 1 1  =  23.


// Bitwise XOR
// Syntax
//     A ^ B


// Values for bit a, b
//             a      b      a ^ b 
//           ------------------------
//             0      0         0
//             0      1         1
//             1      0         1
//             1      1         0
// In other words, a ^ b = 1 when a and b are different.


// What does A ^ B mean ?
// A ^ B implies a ^ b for all corresponding bits of A and B. So, lets say

//        A = 21 ( 10101 ) and B = 6  ( 110 ) 
//        A ^ B = 
//                         1 0 1 0 1
//                     ^   0 0 1 1 0  
//                     ------------------
//                         1 0 0 1 1  =  19.


// Bitwise NOT
// Syntax :
//     ~A


// Values for bit a:
//                                 a   |   ~a
//                              -------|-------
//                                 0   |   1
//                                 1   |   0
// It's the inverse of the bit.


// What does ~A mean ?
// ~A implies inverting every single bit in A. So, lets say

//             A = 21 ( 10101 ) and A is a char ( 1 byte )
//             ~A = 
//                 0 0 0 1 0 1 0 1
//               --------------------------
//                 1 1 1 0 1 0 1 0  = -22 ( Sign bit is 1 ). 


// Left shift operators


// Syntax :
//     A << x


// What does A << x mean ?
// A << x implies shifting the bits of A to the left by x positions. The first x bits are lost this way. The last x bits have 0.


// Example : lets say
//                 A = 29 ( 11101 ) and x = 2, 
//                 so A << 2 means
//                      0 0 1 1 1 0 1 << 2
//                      =============  ------> this sequence of digit shifts to the left by 2 positions
//                     ----------------
//                      1 1 1 0 1 0 0  = 116 
// A << x is equal to multiplication by pow(2, x). Think why. 1 << x is equal to pow(2, x).
// Right Shift Operators


// Syntax
//     A >> x


// What does A » x mean :
// A >> x implies shifting the bits of A to the right by x positions. The last x bits are lost this way.


// Example : Lets say
// A = 29 ( 11101 ) and x = 2,
//                 so A >> 2 means
//                      0 0 1 1 1 0 1 >> 2
//                                ====  -> is lost 
//                     ========== -----> this sequence of digit shifts to the right by 2 positions
//                     ----------------
//                      0 0 0 0 1 1 1 = 7
// A >> x is equal to division by pow(2, x). Think why.