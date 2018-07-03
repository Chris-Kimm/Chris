package method3;

public class main {

	public static void main(String[] args) {
		// memeber 클래스의 인스턴스를 생성
		member member1 = new member();
		//인스턴스 변수를 호출해서 데이터 저장
		member1.setEmail("ggangpae1@gmail.com");
		member1.setPassword("1234");
		member1.setNickname("중앙처리장치");
		member1.setAge(15);
		
		member1.display();

	}

}
