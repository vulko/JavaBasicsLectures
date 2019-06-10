package kvolkov.java.lesson_basics.lesson1;

public class Point {
	
	private static int x = 0;
	private int y = 0;
	
	public int getX() { return x; }	
	public void setX(int value) { x = value; }
	
	public int getY() { return y; }	
	public void setY(int value) { y = value; }
	
	public void printMe() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "X = " + x + " | Y = " + y;		
	}
	
}
