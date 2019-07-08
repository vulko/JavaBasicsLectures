package kvolkov.java.lesson_basics.lesson6;

public class GenericsExample {
	
	static public class Tuple<E> {
		
		E mFirst;
		E mSecond;
		
		public Tuple(E first, E second) {
			mFirst = first;
			mSecond = second;
		}
		
		public String toString() {
			return "[ " + mFirst.toString() + " ; " + mSecond.toString() + " ]";
		}
		
	}
	
	static public class Combination<E, T> {
		
		E mFirst;
		T mSecond;
		
		void setFirst(E first) {
			mFirst = first;
		}
		
		E getFirst() {
			return mFirst;
		}
		
		public Combination(E first, T second) {
			mFirst = first;
			mSecond = second;
		}
		
		public String toString() {
			return "[ " + mFirst.toString() + " ; " + mSecond.toString() + " ]";
		}
		
	}
	
	public static void execute() {
		Tuple<Integer> pair = new Tuple(1, 2);
		System.out.println(pair.toString());
		
		Tuple<String> sPair = new Tuple("привет", "медвед");
		System.out.println(sPair.toString());
		
		Combination<String, Integer> combination = new Combination("номер", 10);
		System.out.println(combination.toString());
		
		combination.setFirst("2");
		
		Combination<Integer, Integer> combination1 = new Combination(0, 10);
		combination1.setFirst(2);
		System.out.println(combination1.toString());		
		
		Tuple<Object> noTypePair = new Tuple(new Object(), new Object());
		noTypePair.mFirst = new String("boxed string");
		noTypePair.mSecond = new Integer(666);
		System.out.println(noTypePair.toString());
	}

}
