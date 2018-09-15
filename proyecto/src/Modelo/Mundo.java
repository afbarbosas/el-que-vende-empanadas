package Modelo;

	public class Mundo {
		public Mundo (){
			
		}
		public double calcularTasaEfectiva(double Interes)
		{
		    double rta= 0.0 ;
		    double tasaPorcentaje = Interes / 100;
		    rta = Math.pow(1+ tasaPorcentaje,(double) (1.0/12.0))-1;
	        System.out.println(rta*100);
		    return rta;
		    
		}
		public double calcularValorCuota(double monto,double tasaEfectiva,double numCuotas)
		{
			double rta = 0.0;
			double calcularAnualidad = calcularAnualidad(tasaEfectiva, numCuotas);
			rta =  calcularAnualidad /monto;
			System.out.println(rta);
			
			return rta;
			
		}
		private double calcularAnualidad(double tasaEfectiva, double numCuotas){
			double rta = 0.0 ;
			double tasaPorcentaje = tasaEfectiva/100;
			rta = Math.pow(1 +tasaPorcentaje, - numCuotas)-1/tasaEfectiva;
			System.out.println(rta);
			
		    return rta;
			
		}

		
		
	}


