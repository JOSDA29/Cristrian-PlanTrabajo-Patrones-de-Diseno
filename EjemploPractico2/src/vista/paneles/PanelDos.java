package vista.paneles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Coordinador;

public class PanelDos extends JPanel implements ActionListener {

	private JTextField txtTexto;
	private JTextField txtNumeroUno;
	private JTextField txtNumeroDos;
	private JButton btnEnviar;
	private JButton btnSuma;
	private Coordinador miCoordinador;

	public PanelDos() {
		setLayout(null);
		setBackground(new Color(255, 165, 0));
		setPreferredSize(new Dimension(400, 400));
		iniciarComponenetes();
	}

	private void iniciarComponenetes() {
		txtTexto = new JTextField();
		txtTexto.setBounds(20, 20, 235, 29);
		add(txtTexto);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(277, 20, 98, 29);
		btnEnviar.addActionListener(this);
		add(btnEnviar);
		
		txtNumeroUno = new JTextField();
		txtNumeroUno.setBounds(20,70,115,29);
		add(txtNumeroUno);
		
		txtNumeroDos = new JTextField();
		txtNumeroDos.setBounds(140,70,115,29);
		add(txtNumeroDos);
		
		btnSuma = new JButton("Sumar");
		btnSuma.setBounds(277, 70, 98, 29);
		btnSuma.addActionListener(this);
		add(btnSuma);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnviar) {
			JOptionPane.showMessageDialog(null, "Lo que ingresa el usuario es "+txtTexto.getText());
		}else if (e.getSource() == btnSuma) {
			int suma = miCoordinador.realizarSuma(txtNumeroUno.getText(), txtNumeroDos.getText());
			JOptionPane.showMessageDialog(null, "La suma es: "+suma);
		} 
		
	}

	public void limpiarCampos() {
		txtTexto.setText("");
		
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
}
