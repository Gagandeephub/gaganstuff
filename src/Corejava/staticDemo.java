package Corejava;

public class staticDemo {
	
	String name;
	String address;
	static String city;
	static String country;

	static{
	city = "Bangalore";
	country = "India";
	}
	
	staticDemo(String name,String address) 
	{
		this.name = name;
		this.address = address;
		
	}
	
	public void getData()
	{
		System.out.println(name+" "+address+" "+city+" "+country);
		
	}

	public static void setData()
	{
		System.out.println(city  +" "+ country);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticDemo sd = new staticDemo("Gagan ","Malleshwaram ");
		staticDemo ss = new staticDemo("Sagar ", "BSK ");
		sd.getData();
		ss.getData();
		staticDemo.setData();
		//staticDemo.
	}

}
