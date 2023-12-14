



public class GFG {
	public static void main(String args[])
	{

		// Create a DoubleConsumer Instance
		DoubleConsumer display = a -> System.out.println(a * 10);
		DoubleConsumer mul = a -> a /= 2;

		// using addThen() method
		DoubleConsumer composite = mul.andThen(display);
		composite.accept(3);
	}
}


