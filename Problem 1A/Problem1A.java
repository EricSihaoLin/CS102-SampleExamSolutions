/**
	
	Explanation to Problem 1A
	
	part (a)
		Answer: 11 times
		
		Because number is initialized to 10, based on the function:
		
		recMethod(10) will call recMethod(9)  	-> 1 time
		recMethod(9) will call recMethod(8)		-> 2 times
		recMethod(8) will call recMethod(7)		-> 3 times
		7 call 6								4
		6 call 5								5
		5 call 4								6
		4 call 3								7
		3 call 2								8
		2 call 1								9
		recMethod(1) will call recMethod(0)		-> 10 times
		recMethod(0) will return 0				-> 11 times
		
	part (b)
		Answer: 1 time
			
		Because number is initialized to -10, based on the function:
			
		recMethod(-10) will return 0  			-> 1 time
		
	part (c)
		Answer to recMethod(20) is 100
		Answer to recMethod(19) is 100
		Answer to recMethod(18 or 17) is 81
		Answer to recMethod(16 or 15) is 64
		Answer to recMethod(14 or 13) is 49
		Answer to recMethod(12 or 11) is 36
		Answer to recMethod(10 or 9) is 25
		
		After examining the outputs, we can see that the result
		to recMethod is basically half of the number rounded up, squared.
		
		In other words, if the input is n, it is (n/2)^2
		
	
**/
class Problem1A {
	public static void main(String[] args) {
		Problem1A p = new Problem1A();
		//p.recMethod(10);
		//p.recMethod(-10);
		
		for(int i = 20; i > 0; i--)
		{
			System.out.println("Answer to recMethod(" + i + "): " + p.recMethod(i));
		}
		
	}
	
	public int recMethod(int number)
	{
		//We can figure out the exact number of times this method gets called
		//by uncommenting the following line:		
		//System.out.println("recMethod invoked with number " + number);
		
		if(number <= 0)
			return 0;
		if(number % 2 == 0)
			return recMethod(number - 1);
		else 
			return number + recMethod(number - 1);
	}
}