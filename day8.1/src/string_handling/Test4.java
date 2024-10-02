package string_handling;
//literal vs non literal string
public class Test4 {

	public static void main(String[] args) {
		String s1="hello";// : Creating a string "hello" and assigning it to s1
		String s2="hello";// : Creating another string "hello" and assigning it to s2
		String s3=new String(s1);// : Creating a new string with the same content as s1 and assigning it to s3
		String s4="Hello";// : Creating a string "Hello" and assigning it to s4
		System.out.println(s1.equals(s2));//t // : Checking if the content of s1 is equal to s2 using equals method and printing the result (true)
		System.out.println(s1.equals(s3));//t : Checking if the content of s1 is equal to s3 using equals method and 
		                                    //printing the result (true)
		System.out.println(s1.equals(s4));//f // : Checking if the content of s1 is equal to s4 using equals method and
		                                   //printing the result (false)
		
		 // : Checking if the content of s1 is equal to s4 ignoring case using equalsIgnoreCase method and printing the result (true)
		System.out.println(s1.equalsIgnoreCase(s4));//t
		System.out.println(s1==s2);//t//: Checking if s1 and s2 reference the same object in memory using == and printing the result (true)
		System.out.println(s1==s3);//f//Checking if s1 and s3 reference the same object in memory using == and printing the result (false
		System.out.println(s1==s4);//f/Checking if s1 and s4 reference the same object in memory using == and printing the result (false
		
		// : Setting s1, s2, s3, and s4 to null, marking the objects for garbage collection (GC)
		s1=s2=s3=s4=null;//How many objs are marked for GC : 1
		

        // Line 13: Creating a new string "hello" and assigning it to s5.
        // Note: s5 refers to an already existing string in the literal pool, so no new object is created.
		String s5="hello";//s5 --> already existing string in literal pool
			

	}

}
