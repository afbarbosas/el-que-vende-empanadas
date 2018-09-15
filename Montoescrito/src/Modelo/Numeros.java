package Modelo;

public class Numeros {
	private String numero;
	public Numeros() {
		numero = "";		
	}
	 public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String Unidades (int num)
	  {
		if(num == 9){
			  this.numero ="nueve";
		}
		return numero;
	  }
	

}
