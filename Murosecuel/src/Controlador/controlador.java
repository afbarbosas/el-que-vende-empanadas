package Controlador;

import Modelo.Mundo;
import Vista.vista;


public class controlador {
	public Mundo mundo;
	public vista vis;
	public controlador(){
		mundo= new Mundo();
		vis=new vista();
	}
	

}
