package Controlador;

import Modelo.Numeros;
import Vista.vista;

public class controlador {
       private Numeros numero;
       private vista vis;
       public controlador()
       {
    	   numero = new Numeros();
    	   vis= new vista();
    	   numero.getNumero(numero.Unidades(vis.darNum()));
       }
       

}
