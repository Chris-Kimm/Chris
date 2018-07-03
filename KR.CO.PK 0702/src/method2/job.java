package method2;

public class job {
	//메소드의 결과형 앞에 static을 붙이면 클래스가 호출 가능한 메소드가 됩니다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//매개 변수가 value형인 경우 : call by value
	//원본 데이터 변경 못함
	public static void incValue(int n) {
		n = n + 1;
	}
	//매개 변수가 reference형인 경우 : call by reference
	//원본 데이터 변경 가능
	public static void incReference(int [] n) {
		n[0]
	}

}
