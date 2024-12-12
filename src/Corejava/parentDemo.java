package Corejava;

public class parentDemo {

	String name = "Sagar";
	int a = 5;
	
	public void getData()
	{
		int a=8;
		int b = a+this.a;
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public void setData()
	{
		System.out.println("You are in parent class");
	}
	public parentDemo()
	{
		System.out.println("Parent Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentDemo pd = new parentDemo();
		pd.getData();
		pd.setData();

	}

}
