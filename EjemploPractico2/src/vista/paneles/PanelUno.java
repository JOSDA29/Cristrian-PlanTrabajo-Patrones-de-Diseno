package vista.paneles;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.DropMode;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controlador.Coordinador;

public class PanelUno extends JPanel{
	
	private JTextArea txtaInternoContenidoUno;
	private Coordinador miCoordinador;

	public PanelUno() {
		setLayout(null);
		setBackground(new Color(0, 191, 255));
		setPreferredSize(new Dimension(400, 400));
		iniciarComponenetes();
	}

	private void iniciarComponenetes() {
		txtaInternoContenidoUno = new JTextArea();
		txtaInternoContenidoUno.setLocation(20, 20);
		txtaInternoContenidoUno.setSize(480, 130);
		txtaInternoContenidoUno.setDropMode(DropMode.INSERT);
		
		String texto = "Heartstopper follows two teenage boys Nick and Charlie as they meet at a British \n"
				+ "grammar school quickly become friends and fall in love.Each volume navigates \n"
				+ "the ups and downs of first love, friendships, coming out and mental health, \n"
				+ "beautifully framed by a warm cast of supporting characters.";
		txtaInternoContenidoUno.setText(texto);
		
		add(txtaInternoContenidoUno);
		
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
}
