package practice;

public class main {
	
	public static void main(String[] args ) {
		//practice 클래스의 인스턴스 생성
		practice practice1 = new practice();
		practice1.setName("noname");
		System.out.println(practice1.getName());
		
		practice practice2 = new practice();
		practice2.setName("noname");
		System.out.println(practice2.getName());
		
		practice practice3 = new practice("park");
		System.out.println(practice3.getName());

}
