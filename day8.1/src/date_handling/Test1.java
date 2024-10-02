package date_handling;

import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// create Date class instance to represent curnt date n time
		Date d1 = new Date(); //An instance of the Date class is created using the default constructor, which initializes
		                      //it with the current date and time. The resulting Date object is assigned to the variable d1.
		System.out.println(d1);
		Date d2 = new Date(20000);//Another instance of the Date class is created using a constructor that takes a long value 
		                          //representing the number of milliseconds since the epoch (January 1, 1970, 00:00:00 GMT).
		                          //In this case, d2 is initialized with a value of 20000 milliseconds.
		System.out.println(d2);
		System.out.println(d1.before(d2));//f//The before method is used to check if d1 is before d2. The result is false since
		                                 //d1 represents the current date and time, which is after the date and time represented by d2.
		System.out.println(d1.after(d2));//t//The after method is used to check if d1 is after d2. The result is true for the
		                                      //same reasons mentioned above.
		System.out.println(d1.equals(d2));//f//The equals method is used to check if d1 is equal to d2. Since the objects were
		                                      //created at different times, the result is false.
		System.out.println("msec " + d1.getTime());// rets no of msecs elapsed after epoch
		          //The getTime method is used to retrieve the number of milliseconds that have elapsed since the epoch
		          //(January 1, 1970, 00:00:00 GMT) for the Date object d1. The result is then printed to the console.
		System.out.println("msec " + d2.getTime());// rets no of msecs elapsed after epoch
		System.out.println(d1.compareTo(d2));// > 0//The compareTo method is used to compare the two Date objects (d1 and d2). It returns an integer value:
		                                            //If the result is negative, it means d1 is before d2.
		                                            //If the result is zero, it means both dates are equal.
		                                             //If the result is positive, it means d1 is after d2.
		                                            //The result is printed to the console, indicating that d1 is after d2 in this case
	}

}
