
public class Foreach {

	public static void main(String[] args) {
		int[] iarr = {10,20,30,40,50};
		
		for(int i=0; i<iarr.length; i++){
			int value = iarr[i];
			System.out.println(value);
		}
		for(int value:iarr){
			//foreach: :을구분으로 두가지의 값
			//:뒤 - 반복되는 자료구조
			//:앞 - iarr를 자동으로 돌면서 꺼내어지는데 값 받을 곳이 필요
			//타입 맞춰준다.
			System.out.println("foreach : "+value);
		}
	}

}
