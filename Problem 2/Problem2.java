class Problem2 {
	//Main method for Problem 2
	public static void main(String[] args) 
	{
		Problem2.getBinarySequence(8);
	}
	
	//This is our public wrapper function
	//All it does is to call the private recursive function to get the recursion started
	public static void getBinarySequence(int length)
	{
		Problem2.getBinarySequenceHelper(length, 0, "");
	}
	
	//This is our private recursive function
	//We take the desired length of the binary string
	//The currentPosition of our progress
	//The current sequence progress
	private static void getBinarySequenceHelper(int length, int currentPosition, String seq)
	{
		//If we have reached our desired length, print the string
		if(currentPosition == length)
		{
			System.out.println(seq);
		}
		//If it is the first position
		//We automatically start with 1
		//Then recursively call ourselves
		else if(currentPosition == 0){
			seq = "1";
			Problem2.getBinarySequenceHelper(length, currentPosition + 1, seq);
		}
		//If it is the last position
		//We automatically append 1 to the end
		//Then recursively call ourselves
		else if(currentPosition == length - 1)
		{
			seq = seq + "1";
			Problem2.getBinarySequenceHelper(length, currentPosition + 1, seq);
		}
		//If it is a middle digit, it can be either 0 or 1
		//We append a 0 first, then recursively call
		//We append a 1 later, then recursively call
		else
		{
			String newSeq0 = seq + "0";
			Problem2.getBinarySequenceHelper(length, currentPosition + 1, newSeq0);
			String newSeq1 = seq + "1";
			Problem2.getBinarySequenceHelper(length, currentPosition + 1, newSeq1);
		}
	}
}