package kvolkov.java.lesson_basics.lesson2;

public class InterfaceExample {
	
	Progress mProgress;
	
	private static class ProgressListener implements ValueChangeListener {
		@Override
		public void onValueChanged(int newValue) {
			System.out.println("Progress value changed to " + newValue);
		}	
	}
	
	public InterfaceExample() {
		mProgress = new Progress();
		
		ProgressListener listener = new ProgressListener();
		mProgress.setListener(listener);
	}
	
	public void addProgress(int val) {
		mProgress.addProgress(val);
	}

}
