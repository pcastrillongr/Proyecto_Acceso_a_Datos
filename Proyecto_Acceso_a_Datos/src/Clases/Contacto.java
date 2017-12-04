package Clases;

public class Contacto {
	
	private int telefono;
	private String Nombre; 
	private boolean especial;
	private String nempleado;


	public Contacto(){}
	
	public Contacto(int telefono, String nombre, boolean especial,String nempleado) {
		super();
		this.telefono = telefono;
		Nombre = nombre;
		this.especial = especial;
		this.nempleado=nempleado;
	}

	public int gettelefono() {
		return telefono;
	}

	public void settelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	@Override
	public String toString() {
		return "Contacto [telefono=" + telefono + ", Nombre=" + Nombre + ", especial=" + especial + "]";
	}
	
	
	public String getNempleado() {
		return nempleado;
	}

	public void setNempleado(String nempleado) {
		this.nempleado = nempleado;
	}
}
