package method2;

public class Main {

	public static void main(String[] args) {
		Job.display();
		
		int x = 10;
		job.incValue(x);
		System.out.println(x);
		
		int [] ar = {100,200};
		job.incReference(ar);
		System.out.println(ar[0]);//?
		
		int[] ar = [100. 200];
		//메소드에게 reference형의 데이터를 넘겨주었습니다.
		//넘겨준 데이터에 변화가 발생할 수 있습니다.
		//이런 경우는 document를 읽어 보거나 데이터를 확인해보아야 합니다.
		Job.incReference(ar);
		System.out.println(ar[0]);//?
	}

}
