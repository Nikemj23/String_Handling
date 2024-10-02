package string_handling;

import java.util.Date;

//mutable StringBuilder
public class Test2 {

	public static void main(String[] args) {
		// initializes a new SB with specified string , n allocates 16 chars
		StringBuilder sb1 = new StringBuilder("testing");
		System.out.println(sb1);// testing
		System.out.println("len= " + sb1.length() + " capa " + sb1.capacity());// 7 23// prints "len= 7 capa 23"
		
		// StringBuilder is mutable, so the original StringBuilder is modified and assigned to sb2
		StringBuilder sb2=sb1.append(false);

		System.out.println(sb1);// prints "testingfalse"
		System.out.println(sb2);// prints "testingfalse"
		System.out.println(sb1==sb2);// prints "true" since sb1 and sb2 refer to the same object

        // Method chaining: append multiple values to the StringBuilder
		sb2=sb1.append('c').append(123.45).
		append(34.567f).append(new Date());
		System.out.println(sb2);  // prints "testingfalsec123.4534.567Thu Jan 01 00:00:00 UTC 1970"

		System.out.println(sb1);  // prints "testingfalsec123.4534.567Thu Jan 01 00:00:00 UTC 1970"

        // Inserting an array of characters at the beginning of the StringBuilder
		char[] chars= {'a','b','c'};
		sb1.insert(0,chars);
		System.out.println(sb1);// prints "abc testingfalsec123.4534.567Thu Jan 01 00:00:00 UTC 1970"
		System.out.println(sb1.length()+" "+sb1.capacity());// prints "48 72"
		
		// Deleting the entire content of the StringBuilder
		sb1.delete(0,sb1.length());
		System.out.println("sb contents "+sb1);    // prints "sb contents "
		System.out.println(sb1.length()+" "+sb1.capacity());  // prints "0 72"
		
		// Trimming the capacity of the StringBuilder to match its length
		sb1.trimToSize();//tries to reduce  capa=length
		System.out.println(sb1.length()+" "+sb1.capacity());  // prints "0 16"

				

	}

}
