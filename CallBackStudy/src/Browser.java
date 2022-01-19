
public class Browser implements OnDownloadListener {

	void imgClick() throws InterruptedException{
		DownLoad loader = new DownLoad(this);
		loader.start();
	}

	@Override
	public void onDownFinish() {
		System.out.println("다운로드 끝");
		
	}

	@Override
	public void onDownFailed() {
		System.out.println("다운로드 실패");
		
	}
}
