package Programa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Clases.Agenda;
import Clases.Container;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OpcionesUsuario {

	private final JFrame FRAME_OPCIONES;
	private JButton btnanhadirempleado;
	private JButton btnactualizarcontactos;
	private JButton btncrearcontacto;
	private JButton btneliminarcontacto;
	private JButton btnvercontacto;
	private JButton btnbinario;
	private JButton btnxml;
	private JButton btnjson;
	private JButton btnexportar;
	private JButton btndesencriptar;
	private int respuesta;

	public JFrame getFRAME_OPCIONES() {
		return FRAME_OPCIONES;
	}

	/**
	 * Create the application.
	 * 
	 * @param agenda2
	 */
	public OpcionesUsuario() {

		respuesta = 0;
		FRAME_OPCIONES = new JFrame();
		btnanhadirempleado = new JButton("ANHADIR EMPLEADO");
		btnactualizarcontactos = new JButton("ACTUALIZAR CONTACTO");
		btncrearcontacto = new JButton("CREAR CONTACTO");
		btneliminarcontacto = new JButton("ELIMINAR CONTACTO");
		btnvercontacto = new JButton("VER CONTACTOS");
		btnbinario = new JButton(" GUARDAR AGENDA EN BINARIO");
		btnxml = new JButton("EXPORTAR AGENDA EN XML");
		btnjson = new JButton("EXPORTAR AGENDA EN JSON");
		btnexportar = new JButton("EXPORTAR CONTACTOS A OTRA AGENDA");
		btndesencriptar = new JButton("DESENCRIPTAR AGENDA");

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */

	private void propiedades() {

		FRAME_OPCIONES.setBounds(100, 100, 738, 541);
		FRAME_OPCIONES.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME_OPCIONES.getContentPane().setLayout(null);

		btnanhadirempleado.setBounds(32, 46, 167, 89);
		FRAME_OPCIONES.getContentPane().add(btnanhadirempleado);

		btnactualizarcontactos.setBounds(280, 42, 176, 97);
		FRAME_OPCIONES.getContentPane().add(btnactualizarcontactos);

		btncrearcontacto.setBounds(525, 44, 167, 93);
		FRAME_OPCIONES.getContentPane().add(btncrearcontacto);

		btneliminarcontacto.setBounds(32, 165, 167, 89);
		FRAME_OPCIONES.getContentPane().add(btneliminarcontacto);

		btnvercontacto.setBounds(525, 165, 167, 89);
		FRAME_OPCIONES.getContentPane().add(btnvercontacto);

		btnbinario.setBounds(244, 165, 245, 89);
		FRAME_OPCIONES.getContentPane().add(btnbinario);

		btnxml.setBounds(32, 287, 290, 89);
		FRAME_OPCIONES.getContentPane().add(btnxml);

		btnjson.setBounds(402, 287, 290, 89);
		FRAME_OPCIONES.getContentPane().add(btnjson);

		btnexportar.setBounds(32, 411, 290, 83);
		FRAME_OPCIONES.getContentPane().add(btnexportar);

		btndesencriptar.setBounds(402, 411, 290, 83);
		FRAME_OPCIONES.getContentPane().add(btndesencriptar);
	}

	private void initialize() {

		propiedades();
		eventos();

	}

	private void eventos() {

		btnanhadirempleado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				respuesta = 1;
				CrearUsuario go = new CrearUsuario(respuesta);
				go.getFRAME_CREAR().setVisible(true);
				FRAME_OPCIONES.setVisible(false);
			}
		});

		btnactualizarcontactos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Container.getAgenda().getListacontactos().size() == 0) {

					JOptionPane.showMessageDialog(null, "ERROR:*Nuestra Agenda No Dispone de Contactos Actualmente*");
				} else {
					respuesta = 2;
					CrearUsuario go = new CrearUsuario(respuesta);
					go.getFRAME_CREAR().setVisible(true);
					FRAME_OPCIONES.setVisible(false);
				}
			}
		});

		btncrearcontacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Container.getAgenda().getListaempleados().size() == 0) {

					JOptionPane.showMessageDialog(null,
							"ERROR:*No tenemos Empleados en la Agenda para asignar el Contacto*");
				} else {
					respuesta = 3;
					CrearUsuario go = new CrearUsuario(respuesta);
					go.getFRAME_CREAR().setVisible(true);
					FRAME_OPCIONES.setVisible(false);
				}
			}
		});

		btneliminarcontacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (Container.getAgenda().getListacontactos().size() == 0) {

					JOptionPane.showMessageDialog(null,
							"ERROR:* Nuestra Agenda no Dispone de Contactos para Eliminar*");
				} else {
					respuesta = 4;
					CrearUsuario go = new CrearUsuario(respuesta);
					go.getFRAME_CREAR().setVisible(true);
					FRAME_OPCIONES.setVisible(false);
				}

			}
		});

	}

}
