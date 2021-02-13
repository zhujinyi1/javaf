package object类;

public class Demo {
	
	public String toString() {
		return "在"+getClass().getName()+"类中重写toString方法";
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(new Demo());
	}

}
//getName:获取名称
//getClass:获取类
