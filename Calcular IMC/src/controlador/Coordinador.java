package controlador;

import modelo.Logica;
import modelo.PersonaDao;
import vista.VentanaPrincipal;

public class Coordinador {
	
	VentanaPrincipal miVentanaPrincipal;
	Logica miLogica;
	PersonaDao miPersonaDao;

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public void setLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	
	public void setPersonaDao(PersonaDao miPersonaDao) {
		this.miPersonaDao = miPersonaDao;
		if (miPersonaDao != null) {
            miPersonaDao.setCoordinador(this);
        }
	}

	public String conclusionImc(double promedio) {
		return miLogica.conclusionImc(promedio);
	}
	
	public double calcularImc(double peso, double talla) {
		return miLogica.calcularImc(peso, talla);
	}
}