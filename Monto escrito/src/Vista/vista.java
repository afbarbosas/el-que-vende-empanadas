package Vista;

import javax.swing.JOptionPane;

import Modelo.Monto;

public class vista {
	public Monto montito ;
	public vista(){
		montito = new Monto();
	}
	public String mostrarMonto(){
		String art = JOptionPane.showInputDialog(null, "escribir monto");
		return art;
		
	}

}
