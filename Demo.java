
public class Demo {

	int a,b;
	Demo(int a){
		this.a=a;
	}
	Demo(int a,int b){
		this(a);
		this.b=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo(1);
		Demo d2=new Demo(2, 4);
		System.out.println(d1.a);
		System.out.println(d2.a);

	}

}
