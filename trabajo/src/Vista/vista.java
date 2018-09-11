package Vista;

import javax.swing.JOptionPane;

public class vista {
	
	public String decirAlgo(){
        String algo = new String ();
        algo = JOptionPane.showInputDialog("Dijite algo");
        		return algo;
	}
	public void muestraAlgo(String mensage){
		JOptionPane.showMessageDialog(null, mensage);
	}

}
