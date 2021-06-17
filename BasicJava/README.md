## Basic Java
**Non primitives** : byte, short, int, float, double etc

**Swapping variables** : Use temp variable to store the data and swap.

**Wrapper Classes** : Primitives has corresponding classes called wrapper classes.

**Auto Boxing** : Primitives to corresponding wrapper class.

**Unboxing** : Wrapper class object to corresponding primitive type.

**Type conversion** : Converting one primitive to different primitive.

**Explicit or widening** : Converting lower to higher primitive.

*Flow* : byte --> Short/char --> int --> long --> float --> double

*Note* : Float 32 bit, but it stores precision values. long to float conversion called as 
widening.

**Implicit or narrowing** : Converting higher to lower primitive.

**BufferedReader** : Reading Character stream, Synchronized, Specify buffer size, read
large input. Disadvantage : Catch exception, extra code to parse to specific type.

**Scanner** : Simplified version of buffered reader, not Synchronized. Suits for small input,
predefined methods

**PrintOrPrintln** : Printing the data to console

**format or printf** : Both do same functionality, Printing the data in specified format.

*Note* : Refer OutputInJavaFormatOrPrintf

**Command Line Arguments** : java CommandLineArguments One Two Three Four

**Escape Sequences** : \ It will escape char after backslash.
*Note* : Verify this class --> EscapeSequence

**Operators** : 

**Incremental operators**

*x++ (z = x++)* : --> It is a combination of two operators. z = x, x = x+1.

*++x (z = ++x)* : --> It is a combination of two operators. x = x+1, z = x.

**Assignment Operators** : =, +=, -=, *=, %=

x += y --> x = x+y;

x -= y --> x = x-y;

x *=y --> x = x * y;

x %=y --> x = x % y;

**Logical Operators** : &&, ||, !

&& --> true if both true 

|| --> ture if one of them true

! --> ture if condition is false, false if condition is true

*Logical Operator short-circuiting* : 

if(x && y) if x is false, it will not execute y.

if(x || y) if x is true, it will not execute y

**Relational Operators** : Generally compares the values --> ==, !=, <, >, >=, <=

**Bitwise Operators** : 

*Bitwise &* : if both bits are 1, output is 1.
  x = 3, y = 6, x bits : 0011, y bits : 0110, x & y = 0010 (2)

*Bitwise |* : if any bit is 1, output is 1.
    x = 3, y = 6, x bits : 0011, y bits : 0110, x & y = 0111 (7)

*Bitwise ^ XOR* : if both bits are different, output is 1.
    x = 3, y = 6, x bits : 0011, y bits : 0110, x & y = 0101 (5)

*Bitwise ~ NOT* : Inverse of bits 
    x = 3 (0000 0011) ~x = 1111 1100 (2 power 32 -1-3 : -4)

*Bitwise left shift (<<)* x = 2 (0000 0010) x<<1 : 0000 0100 (4)

*Bitwise right shift* : x >> 1 : Shift right to one bit, fill zeros at left side(not for -ve numbers).

*Bitwise unsigned right shift* : Shift right to bits, fill zeros at left side for all numbers.

**Nth term of Arithmetic Progression** : Formula --> a + (n-1) * d
    a = starting number, d = difference, n = nth number
    a = 2, d = 1, n = 5. Answer : 6

**Nth term of Geometric Progression** : Formula --> a * r power of n-1
    i/p : 2,4,8,16,32
    a = starting number, r = multiplier, n = 5
    a = 2, r = 2, n = 5. Answer : 2 * 2 power of 4 : 32

**Sum of n natural number** : Sum = n*(n+1)/2

**Find last digit of number** : Ans : n%10, take absolute value for nigative number
    
    Number : 123, ans : 123%10 = 3. 
    Number : -123, ans : Math.abs(-123)%10 = 3