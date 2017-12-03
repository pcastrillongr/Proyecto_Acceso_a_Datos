package Clases;

public class Contacto {
	
	private int teléfono;
	private String Nombre; 
	private boolean especial;
	private String nempleado;


	public Contacto(){}
	
	public Contacto(int teléfono, String nombre, boolean especial,String nempleado) {
		super();
		this.teléfono = teléfono;
		Nombre = nombre;
		this.especial = especial;
		this.nempleado=nempleado;
	}

	public int getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
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
		return "Contacto [teléfono=" + teléfono + ", Nombre=" + Nombre + ", especial=" + especial + "]";
	}
	
	
	public String getNempleado() {
		return nempleado;
	}

	public void setNempleado(String nempleado) {
		this.nempleado = nempleado;
	}
}
