A repetition control structure, which we refer to as a loop, executes a statement of code
multiple times in succession. By using nonconstant variables, each repetition of the statement may be different. For example, a statement that iterates over a list of unique names
and outputs them would encounter a new name on every execution of the loop

## **For Loop:**

```java
// Semicolon and parenthesis are required
for (initialization; booleanExpression; updateStatement) {
	//body
} // Curly braces needed for multiple statements optional for single statement
```

The `for` loop is used when we know the number of times we want to execute a block of code.

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("The value of i is: " + i);
        }
    }
}

```

In this example, the code inside the loop will be executed 5 times, and the value of `i` from 0 to 4 will be printed.

```java
//while keyword
//booleanExpression 
while (booleanExpression) {
	// the lines here are executed as long as the 
	// booleanExpression is true
}
```

The `while` loop is used when we want to execute a block of code repeatedly as long as a particular condition is true.

```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println("The value of i is: " + i);
            i++;
        }
    }
}
```

In this example, the code inside the loop will be executed as long as `i` is less than 5, and the value of `i` from 0 to 4 will be printed.

```java
// Another Example
// method for a rat
/**
 * Class Created for demoing additional conditions 
 * @author BharathwajSoundarara
 *
 */
class Rat {
	int roomInBelly = 5;

	public void eatCheese(int bitesOfCheese) {
		while (bitesOfCheese > 0 && roomInBelly > 0) {
			bitesOfCheese--;
			roomInBelly--;
		}
		System.out.println(bitesOfCheese + " pieces of cheese left");
	}
	public void showRoomInBelly() {
		System.out.println("Room in belly: " + roomInBelly);
	}
}

/**
 * Class for creating an instance of a Rat Class
 * @author BharathwajSoundarara
 *
 */
public class RatDemo {
	public static void main(String[] args) {
		Rat rat = new Rat();
		rat.roomInBelly = 10;
		rat.eatCheese(5);
		// Calling Belly Capacity
		rat.showRoomInBelly();
	}
}
```

Here you can keep changing the *roomInBelly* and *eatCheese* to see that rat will eat only if it has *roomInBelly*

Infinite Loop:

```java
int x = 2;
int y = 5;
while(x < 10)
 y++;
```

You may notice one glaring problem with this statement: it will never end! The boolean
expression that is evaluated prior to each loop iteration is never modified, so the expression *x < 10* will always evaluate to true. The result is that the loop will never end, creating what is commonly referred to as an infinite loop.
Infinite loops are something you should be aware of any time you create a loop in your
application. You should be absolutely certain that the loop will eventually terminate
under some condition. First, make sure the loop variable is modified. Then, ensure that
the termination condition will be eventually reached in all circumstances. As you’ll see
in the upcoming section “Understanding Advanced Flow Control,” a loop may also exit
under other conditions such as a break statement.

## **Do-While Loop:**

```java
do {
	// Body 
}while (booleanExpression);
// do and while are Java Keywords.
//Curly braces are requied for a block of multiple statements, optional for single
//Statements.
```

The `do-while` loop is similar to the `while` loop, but the condition is tested after executing the statements within the loop. Therefore, the loop will always be executed at least once.

```java
public class Main {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("The value of i is: " + i);
            i++;
        } while (i < 5);
    }
}
```

In this example, the code inside the loop will be executed as long as `i` is less than 5, and the value of `i` from 0 to 4 will be printed.

These loop structures offer a lot of flexibility to execute code blocks multiple times. Remember to control your loop carefully to prevent infinite loops.

### While vs Do-While which one to use?

It really doesn’t matter which one to use. Its a matter of personal programming style and preference. But as a thumb rule whenever you want the statements inside a loop to execute ************ATLEAST ONCE************ then prefer using do-while over while statement.