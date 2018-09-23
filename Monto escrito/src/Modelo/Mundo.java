package Modelo;

import javax.swing.JOptionPane;

public  class Mundo {
private Monto montito;
public Mundo(){
	montito = new Monto();
}
public String DarMonto()
{
  String tets = JOptionPane.showInputDialog(null, "dar Monto");
  return tets;
}
}
