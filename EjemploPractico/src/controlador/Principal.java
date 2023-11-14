package controlador;

import modelo.Logica;
import vista.VentanaPrincipal;
import vista.VentanaSecundaria;

public class Principal {

	public static void main(String[] args) {
		//Declaracion de las clases
		VentanaPrincipal ventanaPrincipal;
		VentanaSecundaria ventanaSecundaria;
		Logica logica;
		Coordinador coordinador;
		
		//Instanciamiento de las clases(Craeciones de los objetos de las clases)
		ventanaPrincipal = new VentanaPrincipal();
		ventanaSecundaria = new VentanaSecundaria();
		logica = new Logica();
		coordinador = new Coordinador();
		
		//Establecimiento de las relaciones entre clases
		ventanaPrincipal.setCoordinador(coordinador);
		ventanaSecundaria.setCoordinador(coordinador);
		logica.setCoordinador(coordinador);
		
		//Enviar instancia de cada clase al coordinador
		coordinador.setVentanaPrincipal(ventanaPrincipal);
		coordinador.setVentanaSecundaria(ventanaSecundaria);
		coordinador.setLogica(logica);
		
		ventanaPrincipal.frame.setVisible(true);
		
	}

}
