package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Empleado {
	

private int telefono;
private String Nombre;
private String Apellido;
private String fechanacimiento;
private String  departamento;
private String fechainicio;
private ArrayList<Integer>listacodigos;
private String gruposanguineo;
private LinkedList<Contacto>listacontactos;
private int contactoespecial;

public Empleado(){}


public Empleado(int telefono, String nombre, String apellido, String fechanacimiento, String departamento,
		String fechainicio, ArrayList<Integer> listacodigos, String gruposanguineo,
		LinkedList<Contacto> listacontactos,int contactoespecial) {
	super();
	this.telefono = telefono;
	Nombre = nombre;
	Apellido = apellido;
	this.fechanacimiento = fechanacimiento;
	this.departamento = departamento;
	this.fechainicio = fechainicio;
	this.listacodigos = listacodigos;
	this.gruposanguineo = gruposanguineo;
	this.listacontactos = new LinkedList<Contacto>();
	this.contactoespecial=0;
}
public int getContactoespecial() {
	return contactoespecial;
}


public void setContactoespecial(int contactoespecial) {
	this.contactoespecial = contactoespecial;
}


public Empleado(int telefono, String nombre, String apellido, String fechanacimiento, String departamento,
		String fechainicio, ArrayList<Integer> listacodigos, String gruposanguineo
	) {
	super();
	this.telefono =telefono;
	Nombre = nombre;
	Apellido = apellido;
	this.fechanacimiento = fechanacimiento;
	this.departamento = departamento;
	this.fechainicio = fechainicio;
	this.listacodigos = listacodigos;
	this.gruposanguineo = gruposanguineo;
}




public LinkedList<Contacto> getListacontactos() {
	return listacontactos;
}


public void setListacontactos(LinkedList<Contacto> listacontactos) {
	this.listacontactos = listacontactos;
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
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public String getFechanacimiento() {
	return fechanacimiento;
}
public void setFechanacimiento(String fechanacimiento) {
	this.fechanacimiento = fechanacimiento;
}
public String getDepartamento() {
	return departamento;
}
public void setDepartamento(String departamento) {
	this.departamento = departamento;
}
public String getFechainicio() {
	return fechainicio;
}
public void setFechainicio(String fechainicio) {
	this.fechainicio = fechainicio;
}
public ArrayList<Integer> getListacodigos() {
	return listacodigos;
}
public void setListacodigos(ArrayList<Integer> listacodigos) {
	this.listacodigos = listacodigos;
}
public String getGruposanguineo() {
	return gruposanguineo;
}
public void setgruposanguineo(String gruposanguineo) {
	this.gruposanguineo = gruposanguineo;
}

@Override
public String toString() {
	return "Empleado [teleÌ�fono=" +telefono + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", fechanacimiento="
			+ fechanacimiento + ", departamento=" + departamento + ", fechainicio=" + fechainicio + ", listacodigos="
			+ listacodigos + ", GruposanguiÌ�neo=" + gruposanguineo + "]";
}



}
