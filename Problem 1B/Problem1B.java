class Problem1B {
	//Main method for the Problem1B
	public static void main(String[] args) {
		System.out.println(Problem1B.count7(717));
	}
	
	public static int count7(int i)
	{
		//We do not accept negative integers
		if(i < 0)
		{
			return 0;
		}
		//If integer is less than 10, just check if it is a 7
		if(i < 10)
		{
			if(i == 7)
			{
				return 1;
			}
			else {
				return 0;
			}
		}
		//If integer is greater than 10, then it's more complicated...
		else {
			//We convert integer to a string
			String intString = Integer.toString(i);
			//Get the first digit using substring
			int firstDigit = Integer.parseInt(intString.substring(0, 1));
			//Get everything but the first digit
			int rest = Integer.parseInt(intString.substring(1, intString.length()));
			
			//If the first digit is 7
			if(firstDigit == 7)
			{
				//We return 1 plus the count of 7s in the rest of the digits
				return 1 + count7(rest);
			}
			else {
				//If 7 is not the first digit, we return the count of 7s in the rest of the digits.
				return 0 + count7(rest);
			}
		}
	}
}