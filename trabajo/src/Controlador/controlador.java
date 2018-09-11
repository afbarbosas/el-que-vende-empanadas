package Controlador;

import Modelo.Mundo;
import Vista.vista;

public class controlador {
	private Mundo mundo;
	private vista vi;
	controlador(){
		mundo = new Mundo();
		vi = new vista();
		
	}

}
