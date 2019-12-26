package kvolkov.java.lesson_basics.lesson2;

public class ProgressDialog implements ProgressChangeListener {
	
	@Override
	public void onValueChanged(int newValue) {
		System.out.println("Progress dialog: " + newValue + "%");
	}
	
}