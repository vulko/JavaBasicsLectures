package kvolkov.java.lesson_basics.lesson2;

public class DownloadManager {
	
	private ProgressChangeListener mListener = null;
	
	private int mFileSize = 123456;
	private int mBytesLoaded = 0;
	
	public void setProgressChangeListener(ProgressChangeListener listener) {
		mListener = listener;
	}
	
	public void startDownload() {
		while (mBytesLoaded < mFileSize) {
			mBytesLoaded += download();
			System.out.println("Loaded " + mBytesLoaded + " of " + mFileSize);
			
			if (mListener != null) {
				mListener.onValueChanged( (int) (100.f * mBytesLoaded / mFileSize) );
			}
		}
	}
	
	private int download() {
		return 100;
	}

}
