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
		//�޼ҵ忡�� reference���� �����͸� �Ѱ��־����ϴ�.
		//�Ѱ��� �����Ϳ� ��ȭ�� �߻��� �� �ֽ��ϴ�.
		//�̷� ���� document�� �о� ���ų� �����͸� Ȯ���غ��ƾ� �մϴ�.
		Job.incReference(ar);
		System.out.println(ar[0]);//?
	}

}
