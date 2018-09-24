package Vista;

import javax.swing.JOptionPane;

import Modelo.Monto;

public class vista {
	
	public vista(){
	}
		public int hacerMonto(){
        String art = JOptionPane.showInputDialog(null, "escribir monto");
		int num = Integer.parseInt(art);
			return num;
	    }
	}


