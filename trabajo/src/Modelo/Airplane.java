package Modelo;

public class Airplane extends Vehicle implements Flyer {
	

	@Override
	public void takeOff() {
		System.out.println("�un �un mi motor");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("�un �un por dos");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("�un �un");
	}

	@Override
	public void ruedas() {
		// TODO Auto-generated method stub
		System.out.println("tengo 6 ruedas");
	}
	

}
