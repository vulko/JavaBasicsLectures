package kvolkov.java.lesson_basics.lesson2;

public class ListenerExample {
	
	ProgressDialog mProgressDialog;
	DownloadManager mDlManager;
	
	public void run() {
		mProgressDialog = new ProgressDialog();
		mDlManager = new DownloadManager();
		mDlManager.setProgressChangeListener(mProgressDialog);
		
		mDlManager.startDownload();
	}

}
