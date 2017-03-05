import java.util.*;

/**
		Here is the result of this program:

		Presorted Problem 3B Foo objects
		( 1.0, 1.0 )
		( -2.0, 2.0 )
		( 1.0, 2.0 )
		( 1.0, -1.0 )
		( 2.5, 0.0 )
		( -1.0, 0.0 )
		( 0.0, 3.0 )
		( -1.0, -4.0 )
		( 0.0, 0.0 )
		( 0.0, 1.5 )
		Sorted Problem 3B Foo objects
		( 0.0, 0.0 )
		( -1.0, 0.0 )
		( 1.0, 1.0 )
		( 1.0, -1.0 )
		( 0.0, 1.5 )
		( 1.0, 2.0 )
		( 2.5, 0.0 )
		( -2.0, 2.0 )
		( 0.0, 3.0 )
		( -1.0, -4.0 )

**/

class Problem3B {
	//Main method for Problem3B
	public static void main(String[] args) {
		//Input our given array
		Foo[] list = new Foo[10];
		list[0] = new Foo(1.0, 1.0);
		list[1] = new Foo(-2.0, 2.0);
		list[2] = new Foo(1.0, 2.0);
		list[3] = new Foo(1.0, -1.0);
		list[4] = new Foo(2.5, 0.0);
		list[5] = new Foo(-1.0, 0.0);
		list[6] = new Foo(0.0, 3.0);
		list[7] = new Foo(-1.0, -4.0);
		list[8] = new Foo(0.0, 0.0);
		list[9] = new Foo(0.0, 1.5);
		
		System.out.println("Presorted Problem 3B Foo objects");
		for(Foo f : list)
		{
			System.out.println(f);
		}
		
		Arrays.sort(list);
		
		System.out.println("Sorted Problem 3B Foo objects");
		for(Foo f : list)
		{
			System.out.println(f);
		}
	}
}