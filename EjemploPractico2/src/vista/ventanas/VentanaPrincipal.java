package vista.ventanas;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

import controlador.Coordinador;
import vista.paneles.PanelDos;
import vista.paneles.PanelUno;

import javax.swing.JButton;
import javax.swing.JScrollPane;

public class VentanaPrincipal implements ActionListener{
	
	public JFrame frame;
	private JButton btnPanelUno;
	private JButton btnPanelDos;
	private JLabel lblTitulo;
	private Coordinador miCoordinador;
	
	PanelUno panel1;
	PanelDos panel2;
	JScrollPane scrollPaneles;
	
	
	public VentanaPrincipal() {
		initialize();
	}

	private void initialize() {
		panel1 = new PanelUno();
		panel2 = new PanelDos();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 555, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblTitulo = new JLabel("EJEMPLO JPANEL");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 25));
		lblTitulo.setBounds(0, 0, 539, 57);
		frame.getContentPane().add(lblTitulo);
		
		scrollPaneles = new JScrollPane();
		scrollPaneles.setBounds(10, 91, 519, 181);
		frame.getContentPane().add(scrollPaneles);
		
		btnPanelUno = new JButton("Panel Uno");
		btnPanelUno.setBounds(160, 50, 102, 30);
		btnPanelUno.addActionListener(this);
		frame.getContentPane().add(btnPanelUno);
		
		btnPanelDos = new JButton("Panel Dos");
		btnPanelDos.setBounds(280, 50, 102, 30);
		btnPanelDos.addActionListener(this);
		frame.getContentPane().add(btnPanelDos);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPanelUno) {
			miCoordinador.cargarPanel(1);
		}else if (e.getSource() == btnPanelDos) {
			miCoordinador.cargarPanel(2);
		}
		
	}

	public void definirPanel(PanelDos miPanel) {
		scrollPaneles.setViewportView(miPanel);
		
	}

	public void definirPanel(PanelUno miPanel) {
		scrollPaneles.setViewportView(miPanel);
		
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
}
