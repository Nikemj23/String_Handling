package var_args;

public class Test1 {

	public static void main(String... args) {
		// no args
		displayDetails();
		System.out.println("-----------------------");
		// arg[]
		displayDetails(new Fruit[] { new Apple(), new Orange() });
		//This line calls the displayDetails method with an array of Fruit objects (an Apple and an Orange). 
		//This demonstrates using the method with an array of objects.
		System.out.println("-----------------------");
		// fruits : , separated
		displayDetails(new Orange(),new Apple());
		//This line calls the displayDetails method with individual Fruit objects (an Orange and an Apple).
		//This demonstrates using the method with a variable number of individual objects.
		
		//This line uses printf to format and print a string. It includes placeholders (%d, %s, %f) that are replaced by the 
		//corresponding values (101, "Madhura", 12345.6789). This is a common way to format output in a specific way.
		//printf : formatted printing : Emp details
		
		System.out.printf("ID %d Name %s Salary %.1f %n"
				,101,"Madhura",12345.6789);
		
	}

//add a static method to display details(toString) of all the fruits
	static void displayDetails(Fruit... fruits) {
		for (Fruit f : fruits)
			System.out.println(f);
	}
}

class Fruit {

}

class Apple extends Fruit {

}

class Orange extends Fruit {

}
