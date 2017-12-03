package Clases;

import java.util.LinkedList;

public class  Container {
	
	
	static Agenda agenda=new Agenda(null,null);

	public static Agenda getAgenda() {
		return agenda;
	}

	public static void setAgenda(Agenda agenda) {
		Container.agenda = agenda;
	}
	
	

}
