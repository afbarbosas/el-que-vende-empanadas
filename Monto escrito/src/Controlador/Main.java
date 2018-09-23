
	package Controlador;
	 
	import java.util.List;
	import java.util.StringTokenizer;
	 
	public class Main {
	 
	    String[] Letras = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
	        "DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
	        "VEINTE", "TREINTA", "CUARENTA", "CINCUENTA", "SESENTA", "SETENTA", "OCHENTA", "NOVENTA",
	        "CIEN", "CIENTO", "DOSCIENTOS", "TRESCIENTOS", "CUATROCIENTOS", "QUINIENTOS", "SEISCIENTOS", "SETECIENTOS", "OCHOCIENTOS", "NOVECIENTOS"};
	 
	    Integer[] Valores = {1, 2, 3, 4, 5, 6, 7, 8, 9,
	        10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
	        20, 30, 40, 50, 60, 70, 80, 90,
	        100, 100, 200, 300, 400, 500, 600, 700, 800, 900};
	 
	    List lstLetras = java.util.Arrays.asList(Letras);
	 
	    public static void main(String[] args) {
	        new Main().Letras();
	    }
	 
	    public void Letras() {
	        StringTokenizer st = new StringTokenizer("OCHENTA Y CINCO");
	        Integer numero = 0;
	 
	        while (st.hasMoreTokens()) {
	            String t = st.nextToken();
	            if (t.equals("MIL")) {
	                numero *= 1000;
	            }
	            if (lstLetras.indexOf(t) > -1) {
	                numero += Valores[lstLetras.indexOf(t)];
	            }
	        }
	 
	        System.out.println("Resultado : " + String.valueOf(numero));
	    }
	

	}
