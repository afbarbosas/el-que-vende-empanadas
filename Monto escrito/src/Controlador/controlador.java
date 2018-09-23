package Controlador;

import Modelo.Mundo;
import Vista.vista;

public class controlador {
	private Mundo mundito;
	private vista vis;
	controlador(){
		mundito = new Mundo();
		vis = new vista();
		
	}
}
