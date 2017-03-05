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
		
		return (int)(d1 - d2);
	}
	
	public String toString()
	{
		return "( " + x + ", " + y + " )"; //returns ( x, y )
	}
}