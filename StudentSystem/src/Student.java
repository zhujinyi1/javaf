import java.util.Scanner;

public class Student {
	String name;//����
	char sex;//�Ա�
	int age;//����
	double scores[] = new double[12];//������ѧӢ���ܷ�ƽ����
	String num;//ѧ��
	Student next;
	
	public static Student create() {
		Scanner sc = new Scanner(System.in);
		
		Student phead = new Student();
		Student pnew = new Student();
		Student p = phead;
		pnew.next = null;
		
		phead.next = pnew;
		p = pnew;
		pnew = null;
		
		System.out.println("������������");
		p.name = sc.next();
		System.out.println("�������Ա�");
		String s = sc.next();
		p.sex = s.charAt(0);
		System.out.println("���������䣺");
		p.age = sc.nextInt();
		System.out.println("������ѧ�ţ�");
		p.num = sc.next();
		System.out.println("���������ĳɼ���");
		p.scores[0] = sc.nextDouble();
		System.out.println("���������ĳɼ���");
		p.scores[1] = sc.nextDouble();
		System.out.println("���������ĳɼ���");
		p.scores[2] = sc.nextDouble();
		p.scores[3] = p.scores[0]+p.scores[1]+p.scores[2];
		p.scores[4] = p.scores[3]/3;
		
		while(true) {
			
			System.out.println("�Ƿ������һ��ͬѧ��(�ǣ�1����0)");
			int a = sc.nextInt();
			
			if(a==1) {
				
				Student pnew1 = new Student();
				p = pnew1;
				
				phead.next = pnew1;
				pnew1.next = p;
				p = pnew1;
				pnew1 = null;
				
				System.out.println("������������");
				p.name = sc.next();
				System.out.println("�������Ա�");
				String s1 = sc.next();
				p.sex = s1.charAt(0);
				System.out.println("���������䣺");
				p.age = sc.nextInt();
				System.out.println("������ѧ�ţ�");
				p.num = sc.next();
				System.out.println("���������ĳɼ���");
				p.scores[0] = sc.nextDouble();
				System.out.println("���������ĳɼ���");
				p.scores[1] = sc.nextDouble();
				System.out.println("���������ĳɼ���");
				p.scores[2] = sc.nextDouble();
				p.scores[3] = p.scores[0]+p.scores[1]+p.scores[2];
				p.scores[4] = p.scores[3]/3;
			}
			else {
				break;
			}
		}
	p = null;
	sc.close();
	return phead;
	}
	
	public static void display(Student phead){
		Student p = phead.next;
		System.out.println("����    �Ա�    ����    ѧ��    ���ĳɼ�    ��ѧ�ɼ�    Ӣ��ɼ�    �ܷ�    ƽ����");
		while(p!=null) {
			System.out.println(p.name+"    "+p.sex+p.age+"    "+p.num+"    "+p.scores[0]+"    "+p.scores[1]+"    "+p.scores[2]+"     "+p.scores[3]+"    "+p.scores[4]);
			p = p.next;
		}
	}
}
