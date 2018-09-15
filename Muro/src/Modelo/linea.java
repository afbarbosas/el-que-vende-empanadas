package Modelo;

public class linea {
	public int num;
	public linea ()
	{
		
	}
	public String hacerLineaGiones(int digito){
		int i;
		String linea = "";
		for (i=0 ; i<digito ; i++ )
		{
			linea = linea + "-"; 
		}
		return linea;
	}
	
	public String hacreLineaAsteriscos(int cantidad){
		int i;
		String linea = "";
		for (i=0 ; i<cantidad ; i++ )
		{
			linea = linea + "*"; 
		}
		return linea;
	}
	public String hacerUnaLinea(int digito){
		String Guiones="";
		String Asteriscos="";
		String linea = "";
		Guiones = Guiones + hacerLineaGiones(digito);
		Asteriscos = Asteriscos + hacreLineaAsteriscos(digito-10);
		linea = Guiones + Asteriscos;
		return linea;	
	}
	public static void main(String[] args) {
	
	}


}
