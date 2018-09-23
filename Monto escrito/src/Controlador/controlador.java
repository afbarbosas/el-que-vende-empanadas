package Controlador;

import Modelo.Monto;
import Modelo.Mundo;
import Vista.vista;

public class controlador {
	private Monto montito;
	private vista vis;
	controlador(){
		montito = new Monto();
		vis = new vista();
	}
}
