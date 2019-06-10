package kvolkov.java.lesson_basics.lesson2;

public class Progress {
	
	private ValueChangeListener	mListener = null;
	private int mProgress = 0;
	
	public void setListener(ValueChangeListener listener) {
		mListener = listener;
	}
	
	public void addProgress(int val) {
		mProgress += val;
		
		if (mProgress > 100) {
			mProgress = 100;
		}
		
		if (mListener != null) {
			mListener.onValueChanged(mProgress);			
		} else {
			System.out.println("Listener is not set!");
		}
	}

}