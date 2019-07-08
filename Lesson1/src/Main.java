import kvolkov.java.lesson_basics.lesson1.BaseTypes;
import kvolkov.java.lesson_basics.lesson1.ComplexTypes;
import kvolkov.java.lesson_basics.lesson1.Point;
import kvolkov.java.lesson_basics.lesson2.InterfaceExample;
import kvolkov.java.lesson_basics.lesson3.MinRouteFinder;
import kvolkov.java.lesson_basics.lesson4.MinRouteFinderWithList;
import kvolkov.java.lesson_basics.lesson5.PersonFinder;
import kvolkov.java.lesson_basics.lesson6.GenericsExample;
import kvolkov.java.lesson_basics.lesson7.FileReadWriteExample;

public class Main {	
	
	static Point superPoint;
	
	public static class SomeObject {
		public int a = 0;
		public boolean isMe = false;
		
		public void printMe() {
			System.out.println("SomeObject { a = " + a + " ; isMe = " + isMe + " }");
		}
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
//		lesson1();
//		
//		lesson2();
//
//		lesson3();
//		
//		lesson4();
//		
//		lesson5();
		
//		lesson5_1();
		
//		lesson6();
		
		FileReadWriteExample.writeFile();
		FileReadWriteExample.readFile();
		
		FileReadWriteExample.writeCharFile();
		FileReadWriteExample.readCharFile();
		
	}
	
	private static void lesson1() {
		BaseTypes.baseTypes.printByte();		
		BaseTypes.baseTypes.printShort();
		BaseTypes.baseTypes.printAutoType();

		ComplexTypes.print();
		
		Point point = new Point();
		point.printMe();

		superPoint = point;
		
		Point point1 = new Point();
		point1.setX(29);
		point1.setY(100);

		point.printMe();
		point1.printMe();
		
		Point point2 = new Point();
		point2.printMe();
	}
	
	private static void lesson2() {
		InterfaceExample ifaceExample = new InterfaceExample();
		
		for (int i = 0; i < 100; ++i) {
			ifaceExample.addProgress(10);
		}
	}
	
	private static void lesson3() {
		MinRouteFinder.execute();
	}
	
	private static void lesson4() {
		SomeObject obj1 = new Main.SomeObject();
		obj1.a = 1;
		obj1.isMe = true;
		
		obj1.printMe();
		modifyParameter(obj1);
		obj1.printMe();		
		modifyParameter(obj1.isMe);
		obj1.printMe();	
		obj1.isMe = modifyBool(obj1.isMe);
		obj1.printMe();			
	}
	
	private static void lesson5() {
		MinRouteFinderWithList minRouteFinder = new MinRouteFinderWithList();
		minRouteFinder.initList();
		minRouteFinder.findMixRoute();		
	}
	
	private static void lesson5_1() {
		PersonFinder personFinder = new PersonFinder();
		personFinder.initPersonMapWithIds();
		personFinder.findIndexedPersonByName("Никифор");
		System.out.println("Done");
	}
	
	private static void lesson6() {
		GenericsExample.execute();		
	}
	
	private static void modifyParameter(SomeObject in) {
		in.isMe = false;
	}
	
	private static void modifyParameter(boolean in) {
		in = !in;
	}

	private static boolean modifyBool(boolean in) {
		return !in;
	}

}