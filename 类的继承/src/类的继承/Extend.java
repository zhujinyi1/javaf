package ��ļ̳�;

class a{
	a(){
		System.out.println("����a�Ĺ��췽��");
	}
}

class b extends a{
	b(){
		System.out.println("����b�Ĺ��췽��");
	}
}


public class Extend extends b{

	Extend(){
		System.out.println("����Extend���췽��");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Extend x = new Extend();
	}

}

