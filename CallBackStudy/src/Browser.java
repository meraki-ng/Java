
public class Browser implements OnDownloadListener {

	void imgClick() throws InterruptedException{
		DownLoad loader = new DownLoad(this);
		loader.start();
	}

	@Override
	public void onDownFinish() {
		System.out.println("�ٿ�ε� ��");
		
	}

	@Override
	public void onDownFailed() {
		System.out.println("�ٿ�ε� ����");
		
	}
}
