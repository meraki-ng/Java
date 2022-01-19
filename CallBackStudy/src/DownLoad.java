
import java.lang.Thread;
import java.lang.InterruptedException;

public class DownLoad {
	
	private OnDownloadListener mListener;

	public DownLoad(OnDownloadListener listener){
		mListener = listener;
	}
	public void start() throws InterruptedException{
		System.out.println("다운로드 시작");
		try{
		Thread.sleep(2000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
			mListener.onDownFailed();
		}
		//callback
		mListener.onDownFinish();
	}
}
