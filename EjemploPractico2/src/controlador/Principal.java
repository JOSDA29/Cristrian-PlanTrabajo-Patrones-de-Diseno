package controlador;

import modelo.Logica;
import vista.paneles.PanelDos;
import vista.paneles.PanelUno;
import vista.ventanas.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
		VentanaPrincipal miVentanaPrincipal = new VentanaPrincipal();
		PanelUno miPanelUno = new PanelUno();
		PanelDos miPanelDos = new PanelDos();
		Coordinador miCoordinador = new Coordinador();
		Logica miLogica = new Logica();
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miPanelUno.setCoordinador(miCoordinador);
		miPanelDos.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setPanelUno(miPanelUno);
		miCoordinador.setPanelDos(miPanelDos);
		miCoordinador.setLogica(miLogica);
		
		miVentanaPrincipal.frame.setVisible(true);

	}

}
