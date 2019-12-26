package kvolkov.java.lesson_basics.lesson1;

public class PrintableExample {
	
	private interface Printable {
		public void printMe();
		public void printMessage(String msg);
	}
	
	class PrintableClass implements Printable {

		@Override
		public void printMe() {
			System.out.println("I'm " + this.getClass().getSimpleName());
		}

		@Override
		public void printMessage(String msg) {	
			System.out.println(this.getClass().getSimpleName() + " sais " + msg);
		}

	
	}
	
	public void run() {
		Printable obj = new PrintableClass();
		obj.printMe();
		obj.printMessage("hello");
		
		// FIND ME HERE:
		// https://github.com/vulko/JavaBasicsLectures
	}

	
}
