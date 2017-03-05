# CS102-SampleExamSolutions

## What is this for?
Just helping out friends who are struggling with this class.

Solutions provided within this repository are in no way the best or most optimized code.

Problems are provided below, answers are in the corresponding folder, either as a txt document or as a java program.

## Problem 1A
Consider the following recursive method

```java
public int recMethod (int number) {
	if (number <= 0)
		return 0;
	if (number % 2 == 0)
		return recMethod (number - 1);
	else
		return number + recMethod (number - 1);		
}
```

(a) How many times is this method called (including the initial call) when we run **recMethod(10)**?

(b) How many times is this method called (including the initial call) when we run **recMethod(-10)**?

(c) What does **recMethod** do (i.e. what does it compute)? 

## Problem 1B
Write a recursive function that given a non-negative integer **n**, returns the count of the occurrences of 7 as a digit, so for example 717 yields 2

## Problem 2
Write a recursive method that prints to the screen all binary sequences of a given length that do not start and do not end with a zero. Your answer should contain both a wrapper public method and a private recursive method that performs the task. Your method should not be generating sequences that don't need to be printed.

## Problem 3
Consider the following class definition
```java
public class Foo implements Comparable<Foo>
{
	double x;
	double y;
	
	public Foo (double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int compareTo(Foo other)
	{
		double d1 = x*x + y*y;
		double d2 = other.x * other.x + other.y * other.y;
		
		return (d1 - d2);
	}
	
	public String toString()
	{
		return "( " + x + ", " + y + " )"; //returns ( x, y )
	}
}
```

A. Write a method that creates an ArrayList object and fills it with **n** objects of type **Foo** initialized with random values of x and y (you can pick the range of values).

The value of **n** is specified as a parameter.


B. If you have the following array of **Foo** objects
|    | 0   | 1    | 2   | 3    | 4   | 5    | 6   | 7    | 8   | 9   |
|----|-----|------|-----|------|-----|------|-----|------|-----|-----|
| x= | 1.0 | -2.0 | 1.0 | 1.0  | 2.5 | -1.0 | 0.0 | -1.0 | 0.0 | 0.0 |
| y= | 1.0 | 2.0  | 2.0 | -1.0 | 0.0 | 0.0  | 3.0 | -4.0 | 0.0 | 1.5 |
show what the array will look like after it is passed as an argument to **Arrays.sort(... ) method

## Problem 4
Show the content of the initially empty, stack of Character objects after each of the following operations

Assume that the implementation is array based and follows the efficiency ideas that we discussed in class. Assume that the initial capacity of the array to store the stack is equal to 5 and that its size is doubled whenever the array runs out of room. Initial non-existent locations are marked with X. In the consecutive rows you should cross out all non-existent locations in the array.

| operation        | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
|------------------|---|---|---|---|---|---|---|---|---|---|
| stack.push('c'); | c |   |   |   |   | X | X | X | X | X |
| stack.push('s'); |   |   |   |   |   |   |   |   |   |   |
| stack.pop();     |   |   |   |   |   |   |   |   |   |   |
| stack.push('A'); |   |   |   |   |   |   |   |   |   |   |
| stack.push('w'); |   |   |   |   |   |   |   |   |   |   |
| stack.push('l'); |   |   |   |   |   |   |   |   |   |   |
| stack.push('p'); |   |   |   |   |   |   |   |   |   |   |
| stack.peek();    |   |   |   |   |   |   |   |   |   |   |
| stack.pop();     |   |   |   |   |   |   |   |   |   |   |
| stack.push('%'); |   |   |   |   |   |   |   |   |   |   |
| stack.pop();     |   |   |   |   |   |   |   |   |   |   |
| stack.push('x'); |   |   |   |   |   |   |   |   |   |   |
| stack.pop();     |   |   |   |   |   |   |   |   |   |   |


