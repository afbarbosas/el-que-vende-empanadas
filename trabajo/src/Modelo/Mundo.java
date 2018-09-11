package Modelo;

public class Mundo {
	private Animal animal;
	private Bird bird;
	private Superman superman;
	private Helicoptero helicoptero;
	private Seaplane seaplane;
	public Mundo(){
		bird = new Bird();
		superman = new Superman();
		helicoptero = new Helicoptero();
		seaplane = new Seaplane();
	}

}
