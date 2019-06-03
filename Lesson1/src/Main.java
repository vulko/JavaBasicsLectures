import kvolkov.java.lesson_basics.lesson1.BaseTypes;
import kvolkov.java.lesson_basics.lesson1.ComplexTypes;
import kvolkov.java.lesson_basics.lesson1.Point;

public class Main {		
	
	public static void main(String[] args) {
		
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

}