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
