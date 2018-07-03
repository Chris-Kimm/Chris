package method;

public class Task {
	/Hello Java를 3번 출력해주는 메소드
	public void javaDisplay(){
		for(int i =0; i<3; i=i+1){
			System.out.println("Hello Java");
		}
	}

	
}

//1부터 100까지 더해서 출력해주는 메소드
public void tot() {
	int sum = 0;
	for(int i =1; i <)
}

//로그인 처리 메소드
public boolean login(String id, String pw) {
	boolean result = false;
	if(id.equals("root") && pw.equals("1234")) {
		result = true;
	}
	return result;
}
//회원탈퇴
public boolean deleteMember(String id, String pw) {
	boolean result = false;
	if(id.equals("root") && pw.equals("1234")) {
		result = true;
	}
	return result;