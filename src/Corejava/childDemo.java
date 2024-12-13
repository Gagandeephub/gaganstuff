package Corejava;

public class childDemo extends parentDemo{
 
	String name = "Gagan";
	public void getData()
	{
		System.out.println(super.name);
		System.out.println(name);
	}
	
	public void setData()
	{
		super.setData();
		System.out.println("You are in Child class");
		
	}
	
	public childDemo()
	{
		//super();
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childDemo cd = new childDemo();
		cd.getData();
		cd.setData();
		
	}

}
