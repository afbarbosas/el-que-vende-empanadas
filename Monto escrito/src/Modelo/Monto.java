package Modelo;

import javax.swing.JOptionPane;

public class Monto {
	public String monto;
	public int numero;
	public Monto(){
	}
	public String getMonto() {
		return monto;
	}
	public void setMonto(String monto) {
		this.monto = monto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String busUnidades(int y)
	{
	    String resultado = new String();
	    String []unidades;
	    unidades = new String[8];
	    unidades[0]= "uno"; 
	    unidades[1]= "dos";
	    unidades[2]= "tres";
	    unidades[3]= "cuatro";
	    unidades[4]= "cinco";
	    unidades[5]= "seis";
	    unidades[6]= "siete";
	    unidades[7]= "ocho";
	    unidades[8]= "nueve";
	    resultado = unidades [y-1];
	    return resultado;
	}
	public String busUndecimas(int y)
	{
		String resultado = new String();
		String []undecimas;
		undecimas = new String[8];
		undecimas [0] = "once";
		undecimas [1] = "doce";
		undecimas [2] = "trece";
		undecimas [3] = "catorce";
		undecimas [4] = "quince";
		undecimas [5] = "dieciseis";
		undecimas [6] = "diecisiete";
		undecimas [7] = "dieciocho";
		undecimas [8] = "diesinueve";
		resultado = undecimas [y];
		return resultado;
	}
	public String busDecimas(int y)
	{
		String resultado = new String();
		String []decimas;
		decimas = new String[9];
		decimas [0] = "dies";
		decimas [1] = "veinte";
		decimas [2] = "treinta";
		decimas [3] = "cuarenta";
		decimas [4] = "cincuenta";
		decimas [5] = "sesenta";
		decimas [6] = "ochenta";
		decimas [7] = "noventa";
		resultado = decimas [y-1];
		return resultado;
	}
	
	public String busCentecimas(int y){
		String resultado = new String ();
		String []centecimas;
		centecimas = new String [8];
		centecimas [0] = "cien";
		centecimas [1] = "docientos";
		centecimas [2] = "trecientos";
		centecimas [3] = "cuatrocientos";
		centecimas [4] = "quinientos";
		centecimas [5] = "seiscientos";
		centecimas [6] = "setecientos";
		centecimas [7] = "ochocientos";
		centecimas [8] = "novecientos";
		resultado = centecimas[y-1];
		return resultado;
	}
	public String busMilecimas (int y)
	{
		String resultado = new String ();
		String [] milecimas;
		milecimas = new String [8];
		milecimas [0] = "Mil";
		milecimas [1] = "dosMil";
		milecimas [2] = "tresMil";
		milecimas [3] = "cuatroMil";
		milecimas [4] = "cincoMil";
		milecimas [5] = "seisMil";
		milecimas [6] = "sieteMil";
		milecimas [7] = "ochoMil";
		milecimas [8] = "nueveMil";
		resultado = milecimas[y-1];
		return resultado;
	}
	public  String hacerUnidades()
	{
		String resultado = new String ();
	 if (this.numero>= 0 && this.numero<10) {
		resultado = resultado + busUnidades(this.numero);
	}
	 else{
		 return "cero";
	 }
		return resultado;
	}
	public String hacerDecimas(){
		String resultado = new String ();
		int uni=0;
		String unidades="";
		String decimas="";
		if (this.numero >= 20 && this.numero< 100)
		{
			uni = this.numero%10;
			unidades = unidades+busUnidades(uni); 
			decimas = decimas + busDecimas(this.numero/10);
			resultado = decimas + "y"+ unidades;
		}
		else if (uni == 0)
		{
			return decimas;
		}
	return resultado;
	}
	public String hacerCentecimas()
	{
		String resultado = new String ();
		int uni = 0;
		int deci=0;
		int decim=0;
		String unidades="";
		String decimas="";
		String centecimas="";
		if (this.numero>=100 && this.numero<1000)
		{
		    uni = this.numero%10;
			unidades = unidades + busUnidades(uni);
		    deci = this.numero/10;
		    decim = deci%10;
			decimas = decimas + busDecimas(decim);
			centecimas = centecimas + busCentecimas(this.numero/100);
			resultado = centecimas + decimas + "y" + unidades;
		}
		
		else if (uni == 0)
		{
			return centecimas + decimas;
		}
		else if (decim == 0 && uni > 0 )
		{
			return centecimas + unidades;
		}
		else if (decim == 0 && uni == 0)
		{
			return centecimas;
		}
		return resultado;
	}
	
public String hacerMiles(){
	String resultado = new String ();
	String unidades=  "";
	String decimas = "";
	String centecimas = "";
	String milecimas = "";
	int uni = 0;
	int deci = 0;
	int decim = 0;
	int cen=0;
	int cent = 0;
	if (this.numero >= 1000 && this.numero < 10000 ){
		uni =  this.numero%10;
		unidades = unidades + busUnidades(uni);
		deci = this.numero/10;
		decim = deci%10;
	    decimas = decimas + busDecimas(decim);
		cen = this.numero/100;
		cent = cen%10;
		centecimas = centecimas + busCentecimas(cent);
		milecimas = milecimas + busMilecimas(this.numero/1000);
		resultado =  milecimas + centecimas + decimas + "y" + unidades;
	}
		return resultado;
		
		else if
		
		
	
}

}


