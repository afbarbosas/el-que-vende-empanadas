package Modelo;

public class Mundo {
	public Monto montito;
	String numero;
	public Mundo(){
		montito = new Monto();
		numero = "";
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	

	public String hacerMonto(int num){
		
		 if (num>= 0 && num<10)
		 {
			 numero = montito.hacerUnidades();
		 }
		 else if (num>=10 && num<100 )
		 {
		    numero = montito.hacerDecimas();
		 }
		 else if (num>=100 && num<1000)
		 {
			numero = montito.hacerCentecimas();
		 }
		 else if (num>=1000 && num<10000)
		 {
			 numero = montito.hacerMiles();
					 
		 }
		 return numero;
	}



	}


