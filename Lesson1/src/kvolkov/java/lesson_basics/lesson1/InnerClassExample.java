package kvolkov.java.lesson_basics.lesson1;

public class InnerClassExample {
	
	private class LocalClass {
		
		private int a = 1;
		
		void printMe() {
			System.out.println("a = " + a);
		}
	}
	
	private interface InnerInterface {
		void anonoumous();
	}
	
	private LocalClass obj = new LocalClass(); 
	
	public void run() {
		getLocalClassObject().printMe();
		getAnonymousInnerClass().printMe();
		checkAnonymousInterface();
	}
	
	public LocalClass getLocalClassObject() {
		return new LocalClass();
	}
	
	public LocalClass getAnonymousInnerClass() {		
		LocalClass retVal = new LocalClass() {
			void printMe() {
				System.out.println("This is anonymous inner class!");
			}
		};
		
		return retVal;	
	}
	
	public void checkAnonymousInterface() {
		InnerInterface obj = new InnerInterface() {

			@Override
			public void anonoumous() {
				System.out.println("This is anonymous class object from interface!");
			}
			
		};
		
		obj.anonoumous();
	}
	
}
