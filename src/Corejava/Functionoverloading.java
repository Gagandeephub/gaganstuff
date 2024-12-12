package Corejava;

public class Functionoverloading {
	
	public void getData(int a) {
		System.out.println("Parent");
	}
	
	public void getData(String a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Functionoverloading fd = new Functionoverloading();
		fd.getData(5);
		fd.getData("Gagan");

	}

}
