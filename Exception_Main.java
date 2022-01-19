
public class Exception_Main {

	public static void main(String[] args) {
		
		try{
			boolean isSuccess = login("g82", "11111112");
			if(isSuccess){
				System.out.println("!!!!!!!!�α��� ����");
			}
		}catch (Exception e){
			System.out.println("!!!!!!�α��ν���");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Copyright g82 2015");
			
		}
	}

	static boolean login(String id, String pw) throws Exception {
		//Android = > Server -> id , pw ���� �õ�
		
		boolean isNoid = false;
		boolean isPwWrong = false;
		boolean isNetworkFaild = false;
		boolean isPwExpired = false;
		
		if (isNetworkFaild ) throw new Exception("Network FAILED");
		else if (isNoid ) throw new Exception("Noid FAILED");
		else if (isPwWrong ) throw new Exception("PwWrong FAILED");
		else if (isPwExpired ) throw new Exception("PwExpired FAILED");
		
		return true;
	}
}
