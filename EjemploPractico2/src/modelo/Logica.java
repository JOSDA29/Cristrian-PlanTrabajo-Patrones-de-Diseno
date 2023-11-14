package modelo;

import controlador.Coordinador;

public class Logica {

	private Coordinador miCoordinador;

	public int sumar(String num1, String num2) {
		int n1= Integer.parseInt(num1), n2= Integer.parseInt(num2);
		int suma= n1+n2;
		return suma;
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
}
