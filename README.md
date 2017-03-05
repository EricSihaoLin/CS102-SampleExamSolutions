# CS102-SampleExamSolutions

## What is this for?
Just helping out friends who are struggling with this class.

Solutions provided within this repository are in no way the best or most optimized code.

Problems are provided below, answers are in the corresponding folder, either as a txt document or as a java program.

## Problem 1
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