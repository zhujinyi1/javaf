import java.util.Scanner;

public class Menu {
	
	public static void menu() {
		Student phead = null;
		Scanner sc = new Scanner(System.in);
		Loop:while(true){
			
			System.out.println("1.����һ������");
			System.out.println("2.���һ��ͬѧ");
			System.out.println("3.�޸�ͬѧ��Ϣ");
			System.out.println("4.����һ��ͬѧ");
			System.out.println("5.ɾ��һ��ͬѧ");
			System.out.println("6.��ӡ����");
			System.out.println("����.�˳�");
			System.out.print("����������ѡ��");
			int i = sc.nextInt();
			switch(i) {
				case 1:
					phead = Student.create();
					break;
//		case 2:
//			Student.add(phead);
//			break;
//		case 3:
//			Student.alert(phead);
//			break;
//		case 4:
//			Student.search(phead);
//			break;
//		case 5:
//			Student.delete(phead);
//			break;
				case 6:
					Student.display(phead);
					break;
				default:
					sc.close();
					break Loop;
			}
			
		}
		sc.close();
	}
		
}
