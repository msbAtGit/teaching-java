### Day 3: Data types

In Java, there are two broad categories of data *types*:

1. Primitive types (e.g., `int`, `double`),
2. Reference types (e.g., String, objects and arrays).

We shall describe the primitive types here. We will cover the reference types (classes and objects) in the later part.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b887d340-8cdb-46f7-ad73-15f308a42e23/Untitled.png)

In addition to the eight primitive data types listed above, the Java programming language also provides special support for character strings via the [java.lang.String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html) class. Enclosing your character string within double quotes will automatically create a new `String` object; for example, `String s = "this is a string";`. `String` objects are *immutable*, which means that once created, their values cannot be changed. The `String` class is not technically a primitive data type, but considering the special support given to it by the language, you'll probably tend to think of it as such.

Java is a statically-typed language, which means that all variables must first be declared before they can be used. This involves stating the variable's type and name, as you've seen already:

```java
int myNumber = 5;
String myString = "Hello";
```

In the above example,

- `int` and `String` are Java ***data types***,
- `myNumber` and `myString` are ***variable names***, and
- `5` and `"Hello"` are the values assigned to the ***variables***.

```java
int number;           // Declare a variable named "number" of the type "int" (integer).
number = 99;          // Assign an integer value of 99 to the variable "number".
number = 88;          // Re-assign a value of 88 to "number".
number = number + 1;  // Evaluate "number + 1", and assign the result back to "number".
int sum = 0;          // Declare an int variable named "sum" and assign an initial value of 0.
sum = sum + number;   // Evaluate "sum + number", and assign the result back to "sum", i.e. add number into sum.
int num1 = 5, num2 = 6;  // Declare and initialize 2 int variables in one statement, separated by a comma.
double radius = 1.5;  // Declare a variable named "radius", and initialize to 1.5.
String msg;           // Declare a variable named msg of the type "String".
msg = "Hello";        // Assign a double-quoted text string to the String variable.
int number;           // ERROR: The variable named "number" has already been declared.
sum = 55.66;          // ERROR: The variable "sum" is an int. It cannot be assigned a double.
sum = "Hello";        // ERROR: The variable "sum" is an int. It cannot be assigned a string
```

Maximum and Minimum values for each of the data types:

```java
public class DataTypeMaxValues {
	public static void main(String[] args) {
		System.out.println("Byte range: " + Byte.MIN_VALUE + " to "+ Byte.MAX_VALUE );
		System.out.println("Short Int range: " + Short.MIN_VALUE + " to "+ Short.MAX_VALUE );
		
		// Ganganam Style YouTube video Integer overflow eg
		System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
		System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
		System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
		
		
		
		//Overflow Runtime exceptions will be talked during exception handling
		
	}
}
```

Now that you've learned how to declare and initialize variables, you probably want to know how to *do something* with them. Learning the operators of the Java programming language is a good place to start. Operators are special symbols that perform specific operations on one, two, or three *operands*, and then return a result.

As we explore the operators of the Java programming language, it may be helpful for you to know ahead of time which operators have the highest precedence. The operators in the following table are listed according to precedence order. The closer to the top of the table an operator appears, the higher its precedence. Operators with higher precedence are evaluated before operators with relatively lower precedence. Operators on the same line have equal precedence. When operators of equal precedence appear in the same expression, a rule must govern which is evaluated first. All binary operators except for the assignment operators are evaluated from left to right; assignment operators are evaluated right to left.

| Operators | Precedence |
| --- | --- |
| postfix | expr++ expr-- |
| unary | ++expr --expr +expr -expr ~ ! |
| multiplicative | * / % |
| additive | + - |
| shift | << >> >>> |
| relational | < > <= >= instanceof |
| equality | == != |
| bitwise AND | & |
| bitwise exclusive OR | ^ |
| bitwise inclusive OR | | |
| logical AND | && |
| logical OR | || |
| ternary | ? : |
| assignment | = += -= *= /= %= &= ^= |= <<= >>= >>>= |

Operator precedence is: given an expression which operator will take a greater precedence. 

for example

```java
int a = 10;
int b = 20;
int c = 15;

int d = a - b * c; //Value of d is 290
```

Most commonly used Arithmetic operators

The Java programming language provides operators that perform addition, subtraction, multiplication, and division. There's a good chance you'll recognize them by their counterparts in basic mathematics. The only symbol that might look new to you is "`%`", which divides one operand by another and returns the remainder as its result.

| Operator | Description |
| --- | --- |
| + | Additive operator (also used for String concatenation) |
| - | Subtraction operator |
| * | Multiplication operator |
| / | Division operator |
| % | Remainder operator |

Unary Operators

| Operator | Description |
| --- | --- |
| + | Unary plus operator; indicates positive value (numbers are positive without this, however) |
| - | Unary minus operator; negates an expression |
| ++ | Increment operator; increments a value by 1 |
| -- | Decrement operator; decrements a value by 1 |
| ! | Logical complement operator; inverts the value of a boolean |

**Type Conversion** 

Sometimes it's necessary to convert data from one type to another. This can be done in two ways:

1. **Implicit conversion :** If the two types are compatible, and the target type is larger than the source type, Java will perform an automatic type conversion. For example, you can assign an `int` value to a `long` variable without casting it because `long` is larger than `int`.
    
    ```java
    int i = 100;
    long l = i;  // No explicit casting required here
    ```
    
2. **Explicit conversion:** If the two types are not compatible, or the target type is smaller than the source type, you'll need to perform an explicit conversion.
    
    ```java
    double d = 100.04;
    long l = (long)d; // Explicit casting is required here. Its a BAD PRACTICE
    ```
    

```java
//Converting String to Integer
		
		String numStr = "89";
		int num = Integer.parseInt(numStr);
		System.out.println(num + 10);
```

This brief overview introduces you to data types in Java and how you can manipulate them.

Resources:

https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

https://www.wired.com/2014/12/gangnam-style-youtube-math/