import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner a = new Scanner(System.in);
		int m = a.nextInt();
		double n = a.nextDouble();
		String x = a.next();
		boolean o = a.nextBoolean();
		
		String p = a.nextLine();
		System.out.println(m+"\n"+n+"\n"+x+"\n"+o+"\n"+p+"\n");
		a.close();
	}

}
