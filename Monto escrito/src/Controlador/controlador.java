package Controlador;

import Modelo.Mundo;
import Vista.vista;

public class controlador {
	private Mundo mundito;
	private vista vis;
	private controlador(){
		mundito = new Mundo();
		vis = new vista();
		
	}
}
