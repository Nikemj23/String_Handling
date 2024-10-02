package string_handling;
//immutability of String
public class Test1 {

	public static void main(String[] args) {
		String s = new String("hello");		// Creating a new String object "s" with the value "hello"

		String p=s.concat("hi");	// Concatenating "s" with "hi" and assigning it to a new string "p"
		System.out.println(p);      // Printing the concatenated string "p"

		System.out.println(s);// hello//// Printing the original string "s"
		s += "12345";// s=s+"12345"  // Concatenating "s" with "12345" and updating the reference of "s"

		System.out.println(s);// hello12345   // Printing the modified string "s"

		System.out.println(s.toUpperCase());//HELLO12345   // Converting "s" to uppercase and printing the result
		System.out.println(s);//hello12345     // Printing the original string "s"
		System.out.println(s.replace('l', 'p'));//heppo12345//  Replacing all occurrences of 'l' with 'p' in string "s"

		System.out.println(s);//hello12345
		String s1=s.replaceFirst("he", "zzz");// Replacing the first occurrence of "he" with "zzz" in string "s" and assigning it to "s1"

		System.out.println(s);//orig// Printing the original string "s"

		System.out.println(s1);//replaced// Printing the modified string "s1"
		System.out.println("string len"+s1.length());// Printing the length of the string "s1"

		
		

	}

}
