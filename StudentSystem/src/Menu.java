import java.util.Scanner;

public class Menu {
	
	public static void menu() {
		Student phead = null;
		Scanner sc = new Scanner(System.in);
		Loop:while(true){
			
			System.out.println("1.创建一个链表");
			System.out.println("2.添加一个同学");
			System.out.println("3.修改同学信息");
			System.out.println("4.查找一个同学");
			System.out.println("5.删除一个同学");
			System.out.println("6.打印链表");
			System.out.println("其他.退出");
			System.out.print("请输入您的选择：");
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
