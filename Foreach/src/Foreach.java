
public class Foreach {

	public static void main(String[] args) {
		int[] iarr = {10,20,30,40,50};
		
		for(int i=0; i<iarr.length; i++){
			int value = iarr[i];
			System.out.println(value);
		}
		for(int value:iarr){
			//foreach: :���������� �ΰ����� ��
			//:�� - �ݺ��Ǵ� �ڷᱸ��
			//:�� - iarr�� �ڵ����� ���鼭 ���������µ� �� ���� ���� �ʿ�
			//Ÿ�� �����ش�.
			System.out.println("foreach : "+value);
		}
	}

}
