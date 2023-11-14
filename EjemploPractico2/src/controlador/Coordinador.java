package controlador;

import modelo.Logica;
import vista.paneles.PanelDos;
import vista.paneles.PanelUno;
import vista.ventanas.VentanaPrincipal;

public class Coordinador {
	
	VentanaPrincipal miVentanaPrincipal;
	PanelUno miPanelUno;
	PanelDos miPanelDos;
	Coordinador miCoordinador;
	Logica miLogica;

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
		
	}

	public void setPanelUno(PanelUno miPanelUno) {
		this.miPanelUno = miPanelUno;
		
	}

	public void setPanelDos(PanelDos miPanelDos) {
		this.miPanelDos = miPanelDos;
		
	}

	public void setLogica(Logica miLogica) {
		this.miLogica = miLogica;
		
	}

	public void cargarPanel(int num) {
		switch (num) {
		case 1: 
			miVentanaPrincipal.definirPanel(miPanelUno);
			break;
		case 2: 
			miVentanaPrincipal.definirPanel(miPanelDos);
			break;
		default:
		}
		
	}

	public int realizarSuma(String text1, String text2) {
		return miLogica.sumar(text1, text2);
	}

}
