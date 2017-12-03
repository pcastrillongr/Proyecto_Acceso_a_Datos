package Programa;

import java.awt.EventQueue;
import javax.swing.JFrame;

import Clases.Agenda;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Inicio {

	private JFrame frame;
	private JButton btnempleado;
	private JButton btndirector;

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */

	public Inicio() {

		
		frame = new JFrame();
		btnempleado = new JButton("EMPLEADO");
		btndirector = new JButton("DIRECTOR");

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		propiedades();
		eventos();

	}

	private void propiedades() {
		

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

	
		btndirector.setBounds(48, 72, 117, 108);
		frame.getContentPane().add(btndirector);

		btnempleado.setBounds(253, 72, 117, 108);
		frame.getContentPane().add(btnempleado);

	}

	private void eventos() {

		btnempleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				OpcionesUsuario  go=new OpcionesUsuario();
				go.getFRAME_OPCIONES().setVisible(true);
				frame.setVisible(false);

			}
			
			
			
			
		});

	}
}
