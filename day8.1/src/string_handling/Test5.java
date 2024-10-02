package string_handling;

import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		String s="testing strings in java in java.lang pkg";//A string s is declared and initialized with the specified value.
		System.out.println(s.charAt(0)+" "+s.charAt(s.length()-1));//Prints the first and last characters of the string s.
		System.out.println(s.contains("in"));//t//Prints whether the string s contains the substring "in".
		System.out.println(s.indexOf('t')+" "+s.lastIndexOf('t'));//0 9
		//Prints the index of the first occurrence of the character 't' and the index of the last occurrence of 't' in the string s.


		System.out.println(s.indexOf("in",20));
		//Prints the index of the first occurrence of the substring "in" starting from index 20 in the string s.
		System.out.println(s.lastIndexOf("in"));
		// the index of the last occurrence of the substring "in" in the string s.
		System.out.println(s.startsWith("test")+" "+s.endsWith("!!!!"));
		//Prints whether the string s starts with "test" and ends with "!!!!".

		System.out.println(s.matches(".*[pkg]"));//Prints whether the string s matches the regular expression ".*[pkg]".
		String[] names= {"Anish","Smita","Shubham",
				"Sarita","Kiran","Amiti"};
		//display names sorted as asc (natural order)
		
		//Prints a message, then sorts the names array in ascending order using the Arrays.sort method and 
		//prints the sorted array using Arrays.toString. The sorting is done based on the natural order, which 
		//for strings is lexicographical order.
		System.out.println("Names in asc order");
		//Internally JVM invokes stable sorting algo. , internally calling 
		//String's compareTo method
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		

	}

}
