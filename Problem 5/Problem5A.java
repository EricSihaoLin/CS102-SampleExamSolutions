import java.util.*;

/**

	Result of a sample run:

	List of String before method: 
	Argentina Chile Chile Czech Republic France Georgia India India Poland Romania Romania 

	List of String after method: 
	Argentina Chile Czech Republic France Georgia India Poland Romania 

**/

class Problem5A {
	public static void main(String[] args) {
		//Initialize the ArrayList
		ArrayList<String> list = new ArrayList<String>();
		list.add("Argentina");
		list.add("Chile");
		list.add("Chile");
		list.add("Czech Republic");
		list.add("France");
		list.add("Georgia");
		list.add("India");
		list.add("India");
		list.add("Poland");
		list.add("Romania");
		list.add("Romania");
		
		//Print out ArrayList before
		System.out.println("List of String before method: ");
		for(String s : list)
		{
			System.out.print(s + " ");
		}
		System.out.println("\n");
		
		//Run duplicate removal function
		Problem5A.removeDuplicates(list);
		
		//Print out ArrayList after
		System.out.println("List of String after method: ");
		for(String s : list)
		{
			System.out.print(s + " ");
		}
		
		
	}
	
	public static void removeDuplicates(ArrayList<String> list)
	{
		int current = 0;
		while(current < list.size())
		{
			//Check if it is the last element
			if(current + 1 == list.size())
			{
				//If it is, we are done
				return;
			}
			//If it isn't we, check the current element and the next element
			//If it is the same, we remove the next element
			else if(list.get(current).equalsIgnoreCase((list.get(current + 1)))){
				list.remove(current + 1);
			}
			//If it isn't, we increment our current index to check the next element
			//against the next next element
			else {
				current += 1;
			}
		}
	}
}