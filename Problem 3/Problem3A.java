import java.util.*;

class Problem3A {
	
	//Main method for Problem3A
	//This part is not required for the problem.
	public static void main(String[] args) {
		//Generate the list
		ArrayList<Foo> list = Problem3A.generateFooArray(10);
		
		//Print method to check our output.
		System.out.println("Randomly generated " + list.size() + " Foo objects");
		for(Foo f : list)
		{
			System.out.println(f);
		}
	}
	
	public static ArrayList<Foo> generateFooArray(int n)
	{
		//Create new ArrayList to hold Foo objects
		ArrayList<Foo> list = new ArrayList<Foo>();
		//For loop to create as many Foo objects as we need
		for(int i = 0; i < n; i++)
		{
			//Set bounds of randomness
			int max = 4;
			int min = -4;
			//Calculate the range, required for generating numbers between a range
			int range = (max - min) + 1;
			//Generate random values
			int x = (int) (Math.random() * range + min);
			int y = (int) (Math.random() * range + min);
			
			//Create the Foo object using our randomly generated x and y
			Foo newFoo = new Foo(x, y);
			//Add Foo to list
			list.add(newFoo);
		}
		//Return the list when we are done
		return list;
	}
}