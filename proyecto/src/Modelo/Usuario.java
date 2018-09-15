package Modelo;

public abstract class Usuario {
	
	protected String Documento;
	protected String Nombre;
	protected String apellido;
	protected String correoElectronico;
	protected String nombreArchivo;
	
		public abstract void agregarUsuario();
		public abstract void guardarArchivo();
		public abstract void leerArchivo();

}
