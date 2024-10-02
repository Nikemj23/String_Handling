package string_handling;
//String's == vs equals
public class Test3 {

	public static void main(String[] args) {
		// Create three String objects with the content "hello"
		String s1=new String("hello");
		String s2=new String("hello");
		String s3=new String("Hello");// Note the difference in case (uppercase 'H')

		// Compare references using ==
		System.out.println(s1==s2);//f   // false (different objects)
		System.out.println(s1==s3);//f  // false (different objects)
		
		// Compare content using equals()
		System.out.println(s1.equals(s2));//t  // true (same content)
		System.out.println(s1.equals(s3));//f   // false (different content)

		// Compare content ignoring case(upper,lower) using equalsIgnoreCase()
		System.out.println(s1.equalsIgnoreCase(s3));//t  // true (ignoring case, content is the same)

	}

}
