import kvolkov.java.lesson_basics.lesson1.BaseTypes;
import kvolkov.java.lesson_basics.lesson1.ComplexTypes;
import kvolkov.java.lesson_basics.lesson1.Point;
import kvolkov.java.lesson_basics.lesson2.InterfaceExample;
import kvolkov.java.lesson_basics.lesson3.MinRouteFinder;

public class Main {		
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
//		lesson1();
			
//		lesson2();
		
		MinRouteFinder.execute();

	}
	
	private static void lesson1() {
		BaseTypes.baseTypes.printByte();		
		BaseTypes.baseTypes.printShort();
		BaseTypes.baseTypes.printAutoType();

		ComplexTypes.print();
		
		Point point = new Point();
		point.printMe();
		
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

}