package kvolkov.java.lesson_basics.lesson1;


public class BaseTypes {

	public byte b = 0; // -127 .. 128   2^8 = 256
	public short s = 0;
	public int i = 0;
	public long l = 0L;
	
	public float f = 0.0f;
	public double d = 0.0d;
	
	public boolean logical = false;

	public static BaseTypes baseTypes = new BaseTypes();

	public static void printByte() {
		System.out.println( "byte = " + String.valueOf(baseTypes.b) );
		
		baseTypes.b = 100;
		System.out.println( "byte = " + String.valueOf(baseTypes.b) );

		baseTypes.b += 100;
		System.out.println( "byte = " + String.valueOf(baseTypes.b) );		

		System.out.println( "byte + 1000 = " + String.valueOf( baseTypes.b + 1000 ) );		
	}

	public static void printShort() {
		System.out.println( "short = " + String.valueOf(baseTypes.s) );
		
		baseTypes.s = 100;
		System.out.println( "short = " + String.valueOf(baseTypes.s) );

		baseTypes.s += 100;
		System.out.println( "short = " + String.valueOf(baseTypes.s) );		
	}

	public static void printAutoType() {
		System.out.println( "autotype = " + String.valueOf(100) );
		
		System.out.println( "autotype = " + String.valueOf(100 + 100) );

		System.out.println( "autotype = " + String.valueOf( (byte)(100 + 100) ) );		
	}
}
