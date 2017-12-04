package Programa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Clases.Agenda;
import Clases.Contacto;
import Clases.Container;
import Clases.Empleado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;

public class CrearUsuario {

	private JFrame FRAME_CREAR;
	private JTextField txtnumero;
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtfechanacimiento;
	private JTextField txtdepartamento;
	private JTextField txtfechainicio;
	private JTextField txtlistacodigo;
	private JTextField txtgruposanguineo;
	private JLabel lblTelefono;
	private JLabel lblNombre;
	private JLabel lblapellido;
	private JLabel lblfechanacimiento;
	private JLabel lbldepartamento;
	private JLabel lblfechainicio;
	private JLabel lblcodigos;
	private JLabel lblGrupoSanguineo;
	private JButton btncodigo;
	private JButton btnanhadir;
	private  JLabel lblNewLabel;
	private Empleado x;
	private ArrayList<Integer> numeros;
	private JButton btnactualizar;
	private LinkedList<Empleado> empleados;
	private JLabel lbltelcontacto;
	private JTextField txtempcontacto;
	private JLabel lblncontacto;
	private JTextField txtncontacto;
	private JLabel lblContactoEspecial;
	private JButton btnAdd;
	private JButton btnanhadircontacto;
	private JLabel lblempcontacto;
	private JTextField txttelcontacto;
	private int res;
	private JTextField txtnbusqueda;
	private JLabel lblbusquedausuario;
	private JButton btnbuscaremp;
	private JLabel lblnombrebusqueda;
	private JLabel lblapellidobusqueda;
	private JTextField txtabusqueda;
	private JButton btnVolver;
	private JTextField txteliminar;
	private JLabel lblNombreContactoA;
	private JButton btnbuscareliminar;
	private int nespecial;
	private Contacto cactualizar;
    
	/**
	 * Create the application.
	 * 
	 * @param respuesta
	 * 
	 * @param agenda
	 */
	public CrearUsuario(int respuesta) {

		nespecial = 0;
		res = respuesta;
		lblTelefono = new JLabel("Telefono");
		FRAME_CREAR = new JFrame();
		lblNombre = new JLabel("Nombre Empleado");
		lblapellido = new JLabel("Apellido");
		lblfechanacimiento = new JLabel("Fecha Nacimiento");
		lblfechanacimiento.setBounds(-16, 112, 127, 16);
		lbldepartamento = new JLabel("Departamento");
		lblfechainicio = new JLabel("Fecha Inicio");
		lblcodigos = new JLabel("Lista Codigos");
		lblGrupoSanguineo = new JLabel("Grupo Sanguineo");
		txtnumero = new JTextField();
		txtnombre = new JTextField();
		txtapellido = new JTextField();
		txtfechanacimiento = new JTextField();
		txtdepartamento = new JTextField();
		txtfechainicio = new JTextField();
		txtlistacodigo = new JTextField();
		txtgruposanguineo = new JTextField();
		btncodigo = new JButton("ADD");
		btnanhadir = new JButton("ANHADIR EMPLEADO");
		lblNewLabel = new JLabel("(dd/mm/yyyy)");
		numeros = new ArrayList<Integer>();
		empleados = new LinkedList<Empleado>();
		lbltelcontacto = new JLabel("Telefono Contacto");
		txtempcontacto = new JTextField();
		lblncontacto = new JLabel("Nombre Contacto");
		txtncontacto = new JTextField();
		lblContactoEspecial = new JLabel("Contacto Especial");
		btnAdd = new JButton("ADD");
		btnanhadircontacto = new JButton("ANHADIR CONTACTO");
		lblempcontacto = new JLabel("N.Empleado del contacto");
		txttelcontacto = new JTextField();
		btnactualizar = new JButton("ACTUALIZAR CONTACTO");
		txtnbusqueda = new JTextField();
		lblbusquedausuario = new JLabel("Busca Por Nombre y Apellido");
		lblnombrebusqueda = new JLabel("Nombre");
		lblapellidobusqueda = new JLabel("Apellido");
		txtabusqueda = new JTextField();
		txtnbusqueda = new JTextField();
		lblbusquedausuario = new JLabel("Busca Nombre Contacto a Actualizar");
		btnbuscaremp = new JButton("BUSCAR");
		btnVolver = new JButton("VOLVER");
		txteliminar = new JTextField();
		lblNombreContactoA = new JLabel("Nombre Contacto a Eliminar");
		btnbuscareliminar = new JButton("BUSCAR Y ELIMINAR");

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

		FRAME_CREAR.getContentPane().setLayout(null);
		FRAME_CREAR.setBounds(100, 100, 704, 762);
		FRAME_CREAR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblTelefono.setBounds(30, 34, 61, 16);
		FRAME_CREAR.getContentPane().add(lblTelefono);

		lblNombre.setBounds(30, 56, 115, 16);
		FRAME_CREAR.getContentPane().add(lblNombre);

		lblapellido.setBounds(30, 84, 61, 16);
		FRAME_CREAR.getContentPane().add(lblapellido);

		lblfechanacimiento.setBounds(30, 112, 150, 16);
		FRAME_CREAR.getContentPane().add(lblfechanacimiento);

		lbldepartamento.setBounds(311, 34, 115, 16);
		FRAME_CREAR.getContentPane().add(lbldepartamento);

		lblfechainicio.setBounds(311, 56, 101, 16);
		FRAME_CREAR.getContentPane().add(lblfechainicio);

		lblcodigos.setBounds(311, 84, 120, 16);
		FRAME_CREAR.getContentPane().add(lblcodigos);

		lblGrupoSanguineo.setBounds(311, 112, 123, 16);
		FRAME_CREAR.getContentPane().add(lblGrupoSanguineo);

		txtnumero.setBounds(169, 29, 130, 26);
		FRAME_CREAR.getContentPane().add(txtnumero);
		txtnumero.setColumns(10);

		txtnombre.setBounds(169, 56, 130, 21);
		FRAME_CREAR.getContentPane().add(txtnombre);
		txtnombre.setColumns(10);

		txtapellido.setBounds(169, 79, 130, 26);
		FRAME_CREAR.getContentPane().add(txtapellido);
		txtapellido.setColumns(10);

		txtfechanacimiento.setBounds(169, 107, 130, 26);
		FRAME_CREAR.getContentPane().add(txtfechanacimiento);
		txtfechanacimiento.setColumns(10);

		txtdepartamento.setBounds(438, 29, 130, 26);
		FRAME_CREAR.getContentPane().add(txtdepartamento);
		txtdepartamento.setColumns(10);

		txtfechainicio.setBounds(438, 54, 130, 26);
		FRAME_CREAR.getContentPane().add(txtfechainicio);
		txtfechainicio.setColumns(10);

		txtlistacodigo.setBounds(438, 79, 130, 26);
		FRAME_CREAR.getContentPane().add(txtlistacodigo);
		txtlistacodigo.setColumns(10);

		txtgruposanguineo.setBounds(438, 107, 130, 26);
		FRAME_CREAR.getContentPane().add(txtgruposanguineo);
		txtgruposanguineo.setColumns(10);

		btncodigo.setBounds(579, 80, 61, 24);
		FRAME_CREAR.getContentPane().add(btncodigo);

		btnanhadir.setBounds(240, 168, 186, 74);
		FRAME_CREAR.getContentPane().add(btnanhadir);

		lblNewLabel.setBounds(40, 130, 115, 16);
		FRAME_CREAR.getContentPane().add(lblNewLabel);

		btnactualizar.setBounds(467, 401, 184, 74);
		FRAME_CREAR.getContentPane().add(btnactualizar);

		lbltelcontacto.setBounds(30, 309, 140, 11);
		FRAME_CREAR.getContentPane().add(lbltelcontacto);

		txtempcontacto.setBounds(206, 276, 130, 26);
		FRAME_CREAR.getContentPane().add(txtempcontacto);
		txtempcontacto.setColumns(10);

		lblncontacto.setBounds(30, 332, 115, 16);
		FRAME_CREAR.getContentPane().add(lblncontacto);

		txtncontacto.setBounds(206, 327, 130, 26);
		FRAME_CREAR.getContentPane().add(txtncontacto);
		txtncontacto.setColumns(10);

		lblContactoEspecial.setBounds(30, 360, 130, 16);
		FRAME_CREAR.getContentPane().add(lblContactoEspecial);

		btnAdd.setBounds(206, 360, 60, 29);
		FRAME_CREAR.getContentPane().add(btnAdd);

		btnanhadircontacto.setBounds(80, 401, 186, 74);
		FRAME_CREAR.getContentPane().add(btnanhadircontacto);

		lblempcontacto.setBounds(30, 281, 220, 16);
		FRAME_CREAR.getContentPane().add(lblempcontacto);

		txttelcontacto.setBounds(206, 301, 130, 26);
		FRAME_CREAR.getContentPane().add(txttelcontacto);
		txttelcontacto.setColumns(10);

		txtnbusqueda.setBounds(467, 355, 130, 26);
		FRAME_CREAR.getContentPane().add(txtnbusqueda);
		txtnbusqueda.setColumns(10);

		lblbusquedausuario.setBounds(450, 332, 303, 16);
		FRAME_CREAR.getContentPane().add(lblbusquedausuario);

		btnbuscaremp.setBounds(601, 355, 93, 29);
		FRAME_CREAR.getContentPane().add(btnbuscaremp);

		btnVolver.setBounds(577, 6, 117, 29);
		FRAME_CREAR.getContentPane().add(btnVolver);

		txteliminar.setBounds(206, 555, 130, 26);
		FRAME_CREAR.getContentPane().add(txteliminar);
		txteliminar.setColumns(10);

		lblNombreContactoA.setBounds(30, 560, 202, 16);
		FRAME_CREAR.getContentPane().add(lblNombreContactoA);

		btnbuscareliminar.setBounds(169, 593, 167, 59);
		FRAME_CREAR.getContentPane().add(btnbuscareliminar);

		if (Container.getAgenda().getListaempleados().size() == 0) {
			btnactualizar.setEnabled(false);
		} else {
			btnactualizar.setEnabled(true);

		}

		// ENABLED DEPENDIENDO DE LA RESPUESTA TRAIDA DESDE LAS OPCIONES

		if (res == 1)// respuesta para aÃ±adir usuario
		{
			txtempcontacto.setEnabled(false);
			txttelcontacto.setEnabled(false);
			txtncontacto.setEnabled(false);
			btnAdd.setEnabled(false);
			btnanhadircontacto.setEnabled(false);
			txtnbusqueda.setEnabled(false);
			txtabusqueda.setEnabled(false);
			btnbuscaremp.setEnabled(false);
			btnactualizar.setEnabled(false);
			txteliminar.setEnabled(false);
			btnbuscareliminar.setEnabled(false);

		}
		if (res == 2)// respuesta para actualizar usuario
		{
			// desactivar aÃ±adir usuario
			txtnombre.setEnabled(false);
			txtnumero.setEnabled(false);
			txtapellido.setEnabled(false);
			txtgruposanguineo.setEnabled(false);
			txtlistacodigo.setEnabled(false);
			btncodigo.setEnabled(false);
			btnanhadir.setEnabled(false);
			txtfechanacimiento.setEnabled(false);
			txtdepartamento.setEnabled(false);
			txtfechainicio.setEnabled(false);
			btnactualizar.setEnabled(false);

			// desactivar contacto

			txtncontacto.setEnabled(false);
			txtempcontacto.setEnabled(false);
			txttelcontacto.setEnabled(false);
			btnAdd.setEnabled(false);
			btnanhadircontacto.setEnabled(false);

			// desactivar eliminar
			txteliminar.setEnabled(false);
			btnbuscareliminar.setEnabled(false);
		}
		if (res == 3)// respuesta para anhadir contacto
		{
			txtnombre.setEnabled(false);
			txtnumero.setEnabled(false);
			txtapellido.setEnabled(false);
			txtgruposanguineo.setEnabled(false);
			txtlistacodigo.setEnabled(false);
			btncodigo.setEnabled(false);
			btnanhadir.setEnabled(false);
			txtfechanacimiento.setEnabled(false);
			txtdepartamento.setEnabled(false);
			txtfechainicio.setEnabled(false);
			txteliminar.setEnabled(false);
			btnbuscareliminar.setEnabled(false);
			txtnbusqueda.setEnabled(false);
			txtabusqueda.setEnabled(false);
			btnbuscaremp.setEnabled(false);

		}

		if (res == 4) {

			txtnombre.setEnabled(false);
			txtnumero.setEnabled(false);
			txtapellido.setEnabled(false);
			txtgruposanguineo.setEnabled(false);
			txtlistacodigo.setEnabled(false);
			btncodigo.setEnabled(false);
			btnanhadir.setEnabled(false);
			txtfechanacimiento.setEnabled(false);
			txtdepartamento.setEnabled(false);
			txtfechainicio.setEnabled(false);
			txtnbusqueda.setEnabled(false);
			txtabusqueda.setEnabled(false);
			txtnbusqueda.setEnabled(false);
			txtabusqueda.setEnabled(false);
			txtncontacto.setEnabled(false);
			txtempcontacto.setEnabled(false);
			txttelcontacto.setEnabled(false);
			btnAdd.setEnabled(false);
			btnanhadircontacto.setEnabled(false);
			txtnbusqueda.setEnabled(false);
			txtabusqueda.setEnabled(false);
			btnbuscaremp.setEnabled(false);

		}

	}

	private void eventos() {

		// AÃ‘ADIR EMPLEADO

		btnanhadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String errores = "";
				int contador = 0;
				String regexfecha = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
				Pattern patternnacimiento = Pattern.compile(regexfecha, Pattern.CASE_INSENSITIVE);
				Matcher matcher = patternnacimiento.matcher(txtfechanacimiento.getText());
				Pattern patterninicio = Pattern.compile(regexfecha, Pattern.CASE_INSENSITIVE);
				Matcher matcherinicio = patterninicio.matcher(txtfechainicio.getText());
				int numerotel = 0;

				// NUMERO DE TELEFONO
				if (txtnumero.getText().equals("")) {
					errores += "ERROR\n*Introduzca Telefono\n";
				} else {

					if (txtnumero.getText().length() != 9) {
						errores += "ERROR\n*Introduzca Telefono Correcto\n";
					} else {

						try {
							numerotel = Integer.parseInt(txtnumero.getText());
							contador += 1;
						} catch (Exception ex) {
							errores += "ERROR\n*Introduzca Telefono Correcto\n";
						}
					}
				}

				// NOMBRE EMPLEADO
				if (txtnombre.getText().equals("")) {
					errores += "*Introduzca Nombre\n";
				} else {
					contador += 1;
				}

				// APELLIDO EMPLEADO

				if (txtapellido.getText().equals("")) {
					errores += "*Introduzca Apellido\n";
				} else {
					contador += 1;
				}

				// fechan nacimiento

				if (!matcher.matches()) {

					errores += ("*Introduzca Fecha Nacimiento Valida\n");
				} else {
					contador += 1;
				}

				// departamen
				if (txtdepartamento.getText().equals("")) {
					errores += "*Introduzca Departamento\n";
				} else {
					contador += 1;
				}

				// fechainicio

				if (!matcherinicio.matches()) {

					errores += ("*Introduzca Fecha Inicio Valida\n");
				} else {
					contador += 1;
				}

				// grupo sanguineo

				if (txtgruposanguineo.getText().equals("")) {

					errores += "*Introduzca Grupo Sanguineo";
				} else {

					contador += 1;
				}

				// Mostrar ERRORES
				if (contador != 7) {

					JOptionPane.showMessageDialog(null, errores);
				} else {

					x = new Empleado(numerotel, txtnombre.getText(), txtapellido.getText(),
							txtfechanacimiento.getText(), txtdepartamento.getText(), txtfechainicio.getText(), numeros,
							txtfechainicio.getText(), null, 0);
					Container.getAgenda().getListaempleados().add(x);
					JOptionPane.showMessageDialog(FRAME_CREAR, "Empleado Anhadido con Exito");
					OpcionesUsuario go = new OpcionesUsuario();
					go.getFRAME_OPCIONES().setVisible(true);
					FRAME_CREAR.dispose();

				}

			}
		});

		// evento anhadir codigos

		btncodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero;

				try {
					numero = Integer.parseInt(txtlistacodigo.getText());
					numeros.add(numero);
					JOptionPane.showMessageDialog(null, "Codigo Anhadido Correctamente");

				} catch (Exception exx) {
					JOptionPane.showMessageDialog(null, "ERROR\n*Introduzca Codigo Valido");

				}
			}
		});

		// ACTUALIZAR CONTACTO

		btnactualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean escorrecto = true;
				String errores = "ERROR\n";

				for (Empleado emp : Container.getAgenda().getListaempleados()) {
					if (emp.getNombre().equals(txtempcontacto.getText())) {
						escorrecto = true;
					} else {
						escorrecto = false;
						errores += "No puede asignar un Contacto a un Empleado que no esta en la agenda";
					}
				}

				if (escorrecto) {

					cactualizar.setNempleado(txtempcontacto.getText());
					cactualizar.setNombre(txtncontacto.getText());
					cactualizar.settelefono(Integer.parseInt(txttelcontacto.getText()));
					JOptionPane.showMessageDialog(null, "Contacto Actualizado");
					OpcionesUsuario go = new OpcionesUsuario();
					go.getFRAME_OPCIONES().setVisible(true);
					FRAME_CREAR.setVisible(false);
				} else {

					JOptionPane.showMessageDialog(null, errores);
				}

			}
		});

		// BUSCAR CONTACTO PARA ACTUAlizar
		btnbuscaremp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				boolean encuentra = false;

				if (txtnbusqueda.equals("") || txtabusqueda.equals("")) {
					JOptionPane.showMessageDialog(null, "ERROR*Introduzca todos los datos");
				} else {

					for (Contacto c : Container.getAgenda().getListacontactos()) {

						if (c.getNombre().equals(txtnbusqueda.getText())) {

							cactualizar = c;
							JOptionPane.showMessageDialog(null, "EUREKA: Contacto Encontrado");
							txttelcontacto.setEnabled(true);
							txtncontacto.setEnabled(true);
							txtempcontacto.setEnabled(true);
							txttelcontacto.setText(String.valueOf(c.gettelefono()));
							txtncontacto.setText(c.getNombre());
							txtempcontacto.setText(c.getNempleado());
							btnactualizar.setEnabled(true);
							encuentra = true;
							btnbuscaremp.setEnabled(false);

						}
					}
				}

				if (!encuentra) {
					JOptionPane.showMessageDialog(null, "El contacto no se encuentra en nuestra agenda");

				}

			}
		});
		// VOLVER A OPCIONES

		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				OpcionesUsuario go = new OpcionesUsuario();
				go.getFRAME_OPCIONES().setVisible(true);
				FRAME_CREAR.setVisible(false);
			}
		});

		// ANHADIR CONTACTO

		btnanhadircontacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String errores = "ERROR\n";
				boolean escorrecto = false;
				int contador = 0;
				int telefono = 0;
				boolean aparece = false;
				boolean lleno = false;

				if (txtempcontacto.equals("")) {
					errores += "*Introduzca el nombre del Empleado\n";

				}

				else {
					contador += 1;
				}

				if (txttelcontacto.getText().equals("") || txttelcontacto.getText().length() != 9) {

					errores += "*Introduzca un numero de telefono ";
				} else {
					try {
						telefono = Integer.parseInt(txttelcontacto.getText());
						contador += 1;
					} catch (Exception ex) {
						errores += "*Introduzca un numero de telefono valido";
					}

				}
				if (txtncontacto.equals("")) {
					errores += "Introduzca el nombre del contacto";

				} else {
					contador += 1;
				}

				if (contador == 3) {

					for (Empleado x : Container.getAgenda().getListaempleados()) {

						if (x.getNombre().equals(txtempcontacto.getText())) {
							aparece = true;
							if (x.getContactoespecial() == 5) {

								lleno = true;

							} else {

								Contacto c = new Contacto(telefono, txtncontacto.getText(), true, x.getNombre());
								x.getListacontactos().add(c);
								x.setContactoespecial(x.getContactoespecial() + nespecial);
								Container.getAgenda().getListacontactos().add(c);
								escorrecto = true;

							}

						} else {
							aparece = false;

						}
					}
					if (!aparece) {
						JOptionPane.showMessageDialog(null, "ERROR *El empleado no aparece en nuestra agenda");
					} else {

						if (escorrecto) {
							JOptionPane.showMessageDialog(null, "Contacto Anhadido con Exito");
							OpcionesUsuario go = new OpcionesUsuario();
							go.getFRAME_OPCIONES().setVisible(true);
							FRAME_CREAR.setVisible(false);
						}
						if (lleno) {
							JOptionPane.showMessageDialog(null,
									"ERROR: El empleado no puede tener mas contactos especiales");

						}
					}

				} else {
					JOptionPane.showMessageDialog(null, errores);
				}

			}

		});

		// ENCONTRAR Y ELIMINAR CONTACTO

		btnbuscareliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nombre = "";
				boolean esta = false;
				if (txteliminar.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "ERROR: Introuzca el nombre del Contacto a Eliminar");
				} else {

					for (Contacto contacto : Container.getAgenda().getListacontactos()) {

						if (contacto.getNombre().equals(txteliminar.getText())) {
							Container.getAgenda().getListacontactos().remove(contacto);
							JOptionPane.showMessageDialog(null, "Contacto Eliminado");
							esta = true;
							nombre = contacto.getNempleado();

						}
						for (Empleado x : Container.getAgenda().getListaempleados()) {
							if (x.getNombre().equals(nombre)) {
								x.getListacodigos().remove(contacto);
							}
						}

					}

					if (!esta) {
						JOptionPane.showMessageDialog(null, "ERROR*NO entcontramos el contacto a eliminar");
					}

				}

			}
		});

		btnAdd.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				nespecial = 1;
			}

		});

	}

	public void setFRAME_CREAR(JFrame FRAME_CREAR) {
		this.FRAME_CREAR = FRAME_CREAR;
	}

	public JFrame getFRAME_CREAR() {
		return FRAME_CREAR;
	}

}
