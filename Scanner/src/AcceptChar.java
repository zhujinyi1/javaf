import java.util.Scanner;
public class AcceptChar {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner a = new Scanner(System.in);
		String x = a.next();    //����String���ͣ����������ʱ��ֻ������char
		char m = x.charAt(0);   //����ת��
		System.out.println(m);
		/*Scanner�಻��ֱ�ӽ���char���ͣ������Ƚ���String���ͣ���ת����char����*/
		a.close();
	}

}
