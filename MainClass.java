package TestProject;

public class MainClass {

	public static void main(String[] args) {
		
		//Ŭ�����κ��� ��ü ���� -> new��� Ű���� �̿��Ͽ� ��ü ������
		Granger granger = new Granger();
		//������ ȣ�� - �޸� ���ε�
		//�޸𸮿� �ö� ��ü��, granger ����Ű�� �ȴ�(���۷���)
		granger.color="red";
		granger.gear="auto";
		granger.price=300000000;
		
		granger.run();
		granger.stop();
		granger.info();
		
		//��ü2��
		Granger granger1 = new Granger();
		granger1.color="blue";
		granger1.gear="auto";
		granger1.price=500000000;
		granger1.run();
		granger1.stop();
		granger1.info();
		
		ByCycle bycle = new ByCycle("yello", 100);
		
		bycle.info();
		
	}

}
