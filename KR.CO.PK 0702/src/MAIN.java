
//Chris ��� Ŭ������ ����
class Chris {
	
	//�̷��� Ŭ���� �ȿ� static ���� ������� ������ instance ������� �մϴ�.
	//�� �������� ��ü�� ������� �� �� ��ü���� ������ �޸𸮸� �Ҵ� �޽��ϴ�.
	int num;//��ȣ�� �����ϱ� ���� ����
	String name;//�̸��� �����ϱ� ���� ����
	String phone;//��ȭ��ȣ�� �����ϱ� ���� ����
	//static ���� - ���� 
	static String schoolName;
	
	//TEN�̶�� ������ 10�� ���� : ������ �� �����ϴ�.
	static int x = 10;
	static final int TEN = x;
	
}
public class MAIN {

	
	
	public static void main(String[] args) {
		//�ν��Ͻ� 2�� ����
		Chris person1 = new Chris();
		Chris person2 = new Chris();
		//�� �ν��Ͻ��� num�� ���� ���
		System.out.println("person1:"+person1.num);
		System.out.println("person2:"+person2.num);
		//person1�� num�� 1�� ����
		person1.num = 1;
		System.out.println("person1:"+person1.num);
		System.out.println("person2:"+person2.num);
		
		//static�� �ϳ��� ���� �����ϱ� ������
		//�������� �����ϸ� �ٸ� ��ο� ������ ��Ĩ�ϴ�.
		person1.schoolName = "TB �����б�";
		
		System.out.println("person1:"+person1.schoolName);
		System.out.println("person2:"+person2.schoolName);
	
		/*
		//Chris ��� Ŭ�� ���� �ν��Ͻ��� ����
		Chris ins = new Chris();
		//�ν��Ͻ� �̸��� ����ϸ� toString()�̶�� �޼ҵ��� ����� ȣ��
		//������ Ŭ���� �̸��� �ؽ��ڵ尡 ���
		//�����ϸ�null�̶�� �������� �ƴϸ� ���ܰ� ���� 
		
		System.out.println(ins);
		
		
		//Hello Jave�� 3�� ����ϴ� �۾�
		for(int i=0; i<3; i=i+1){
			System.out.println("Hello Java");
		}
		//i�� for(���) �ȿ��� ������� ������ �ٱ������� ����� �� �����ϴ�.
		//System.out.println(i);
		
		//���� ������ �ݵ�� �ʱ�ȭ �ؼ� ����ؾ� �մϴ�.
		//int k;
		//System.out.println(k);
	
	}


	}
	*/
	}
}


