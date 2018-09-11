package Modelo;

public class Superman extends Animal implements Flyer  {

	@Override
	public void eat() {
		System.out.println("yo como sucaritas te da energia cada dia ;) ");
		// TODO Auto-generated method stub
		
	}
	public void sleep(){
		System.out.println("yo no duermo, I AM BATMAN");
	}

	@Override
	public void takeOff() {
		System.out.println("malos del planeta");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		System.out.println("soy de la tierra su protector");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		System.out.println("yo vuelo bn chingon");
		// TODO Auto-generated method stub
		
	}
	public void leapBuilding(){
		
	}
	public void stopBullet(){
		
	}

}
