package Vista;

import javax.swing.JOptionPane;

public class vista {
	public vista(){
		
	}
public int mostrarMonto()
{
		String mensaje = "El monto escrito de: "+numero.getValor()+" es:\n"+numero.getMonto();
		JOptionPane.showMessageDialog(null, mensaje, data.nombreApp, JOptionPane.INFORMATION_MESSAGE);
	}
}
}
