package Modelo;

public class Proveedor extends Usuario{
	public String Documento;
	public String Nombre;
	public String apellido;
	public String correoElectronico;
	

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	@Override
	public void agregarUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void guardarArchivo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leerArchivo() {
		// TODO Auto-generated method stub
		
	}
	

}
