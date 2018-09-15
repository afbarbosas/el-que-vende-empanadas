package Vista;

import javax.swing.JOptionPane;

public class vista {
	public vista (){
		
	}
	public int darNum()
	{
		String CU = JOptionPane.showInputDialog("ingrese num ");
		 int num = Integer.parseInt(CU);
		return num;
		}
}
