package Controlaodr;

import Modelo.Mundo;
import Vista.vista;

public class Controlador {
private Mundo m;
private vista v;
public Controlador()
{
	v= new vista();
	m= new Mundo ();
	m.calcularTasaEfectiva(v.darTasaNominal());
	m.calcularValorCuota(v.darTasaNominal(),v.darNumcuotas(),v.darMonto());
}



}
