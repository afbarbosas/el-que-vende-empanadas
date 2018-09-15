package Modelo;

public class Credito {
	private int numCuotas;
	private double tasaNominal ;
	private double tasaEjectiva;
	private double monto;
	private double cuota;
	private double interes;
	private double amortizacion;
	
	
	public Credito(int numCuotas, double tasaNominal, double tasaEjectiva, double monto, double cuota, double interes, double amortizacion) {
	super();
	this.numCuotas = numCuotas;
	this.tasaNominal = tasaNominal;
	this.tasaEjectiva = tasaEjectiva;
	this.monto = monto;
	this.cuota = cuota;
	this.interes = interes;
	this.amortizacion=amortizacion;
}

	public int getNumCuotas() {
		return numCuotas;
	}
	public void setNumCuotas(int numCuotas) {
		this.numCuotas = numCuotas;
	}
	public double getTasaNominal() {
		return tasaNominal;
	}
	public void setTasaNominal(double tasaNominal) {
		this.tasaNominal = tasaNominal;
	}
	public double getTasaEjectiva() {
		return tasaEjectiva;
	}
	public void setTasaEjectiva(double tasaEjectiva) {
		this.tasaEjectiva = tasaEjectiva;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getAnudir() {
		return amortizacion;
	}
	public void setAnudir(double anudir) {
		this.amortizacion = anudir;
	}
	

}
