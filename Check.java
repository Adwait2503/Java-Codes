
public class Check {

	static int x=10;
	int y;
	static{
		System.out.println("Static 1");
		{
			System.out.println("Static 2");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check obj=new Check();
		//Check obj1=new Check();
		obj.x=100;
		System.out.println(obj.x);
		//System.out.println(obj1.x);
	}

}
