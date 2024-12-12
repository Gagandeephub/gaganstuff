package Corejava;

public class Functionoverriding extends Functionoverloading{
	
	public void getData(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functionoverriding fc = new Functionoverriding();
		fc.getData(5);
		fc.getData("Dad");
	}

}
