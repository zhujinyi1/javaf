import java.util.Scanner;
public class AcceptChar {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner a = new Scanner(System.in);
		String x = a.next();    //接收String类型，但是输入的时候只能输入char
		char m = x.charAt(0);   //类型转换
		System.out.println(m);
		/*Scanner类不能直接接收char类型，所以先接收String类型，再转换成char类型*/
		a.close();
	}

}
