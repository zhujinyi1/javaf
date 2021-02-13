package 类的继承;

class a{
	a(){
		System.out.println("调用a的构造方法");
	}
}

class b extends a{
	b(){
		System.out.println("调用b的构造方法");
	}
}


public class Extend extends b{

	Extend(){
		System.out.println("调用Extend构造方法");
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Extend x = new Extend();
	}

}

