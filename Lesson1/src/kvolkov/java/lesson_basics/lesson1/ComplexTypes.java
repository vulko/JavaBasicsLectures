package kvolkov.java.lesson_basics.lesson1;

public class ComplexTypes {
	
	public static void print() {

		String str = "123";
		String str1 = "123";
		
		System.out.println("str = " + str);
		
		if ( str.equals("123") ) {
			System.out.println("str equals 123");			
		} else {
			System.out.println("str !equals 123");						
		}
				
		if ( str == str1 ) {
			System.out.println("str == str1");			
		} else {
			System.out.println("str != str1");						
		}
			
		str = "str";
		if ( str == str1 ) {
			System.out.println("str == str1");			
		} else {
			System.out.println("str != str1");						
		}
			
		str1 = str;
		str = "new str";
		if ( str == str1 ) {
			System.out.println("str == str1");			
		} else {
			System.out.println("str != str1");						
			System.out.println("str = " + str);						
			System.out.println("str1 = " + str1);						
		}
				
	}

}
