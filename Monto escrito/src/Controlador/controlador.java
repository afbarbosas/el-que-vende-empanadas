package Controlador;

import Modelo.Mundo;
import Vista.vista;

public class controlador {
	public vista vis;
	public Mundo mundito; 
	controlador(){
		vis = new vista();
		mundito = new Mundo();
		mundito.hacerMonto(vis.hacerMonto());
	}
}
