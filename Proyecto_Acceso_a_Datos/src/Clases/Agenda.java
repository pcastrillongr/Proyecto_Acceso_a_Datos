package Clases;

import java.util.LinkedList;

public  class Agenda {
	
	LinkedList<Empleado>listaempleados;
	LinkedList<Contacto>listacontactos;
	
	
	public Agenda(LinkedList<Empleado> listaempleados, LinkedList<Contacto> listacontactos) {
		super();
		this.listaempleados = new LinkedList<Empleado>();
		this.listacontactos = new LinkedList<Contacto>();
		
		
	}
	public Agenda(){}
	public Agenda(LinkedList<Empleado> listaempleados) {
		super();
		this.listaempleados = new LinkedList<Empleado>();
		
	}

	@Override
	public String toString() {
		return "Agenda [listaempleados=" + listaempleados.toString() + ", listacontactos=" + listacontactos.toString() + "]";
	}
	public LinkedList<Empleado> getListaempleados() {
		return listaempleados;
	}


	public void setListaempleados(LinkedList<Empleado> listaempleados) {
		this.listaempleados = listaempleados;
	}


	public LinkedList<Contacto> getListacontactos() {
		return listacontactos;
	}


	public void setListacontactos(LinkedList<Contacto> listacontactos) {
		this.listacontactos = listacontactos;
	}
	

}
