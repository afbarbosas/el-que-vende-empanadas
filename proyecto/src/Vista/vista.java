package Vista;

import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;

public class vista 
{
public vista()
{
}
public int darNumcuotas()
{
	String CU = JOptionPane.showInputDialog("ingrese num cuotas");
	 int num = Integer.parseInt(CU);
	return num;
	
}
public double darTasaNominal(){
	String TANO = JOptionPane.showInputDialog("ingresar tasa nominal");
	double num = Double.parseDouble(TANO);
	return num;
	
}
public double darMonto()
{
	String MON= JOptionPane.showInputDialog("igresar monto");
	double num = Double.parseDouble(MON);
	return num;
	
}
public double darUsuario(){
	String USU= JOptionPane.showInputDialog("ingrese ID,nombre,apellido,correo");
	double num = Double.parseDouble(USU);
	return num;
}

}

