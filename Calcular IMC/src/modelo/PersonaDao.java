
package modelo;

import java.util.ArrayList;

import controlador.Coordinador;

public class PersonaDao {
	Coordinador miCoordinador;
	PersonaVo miPersonaVo;
	ArrayList<PersonaVo> listaPersonas;
	
	public PersonaDao() {
		listaPersonas = new ArrayList<PersonaVo>();
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}
	
	public String mostrarImc(PersonaVo miPersonaVo) {
		String msg = "";
		msg = "———————————————————————————————————————————————\n";
		msg += "<<CALCULO IMC>>\n";
		msg += "Documento: "+miPersonaVo.getDocumento()+"\n";
		msg += "Nombre: "+miPersonaVo.getNombre()+" \n";
		msg += "IMC: "+miPersonaVo.getImc()+"\n";
		msg += "Conclusion: "+miPersonaVo.getConclusion()+"\n";
		msg += "———————————————————————————————————————————————\n\n";
		return msg;
	}	
	
	public String consultarListadoPersonas() {
		String msg = "";
		
		miPersonaVo = null;
		for (int i = 0; i < listaPersonas.size(); i++) {
			miPersonaVo= listaPersonas.get(i);
			msg += "———————————————————————————————————————————————\n";
			msg += "<<REGISTROS>>\n";
			msg += "Documento: "+miPersonaVo.getDocumento()+"\n";
			msg += "Nombre: "+miPersonaVo.getNombre()+" \n";
			msg += "Edad: "+miPersonaVo.getEdad()+"\n";
			msg += "Peso: "+miPersonaVo.getPeso()+" \n";
			msg += "Talla: "+miPersonaVo.getTalla()+" \n";
			msg += "IMC: "+miPersonaVo.getImc()+"\n";
			msg += "Conclusion: "+miPersonaVo.getConclusion()+"\n";
			msg += "———————————————————————————————————————————————\n\n";
		}
		return msg;
	}

	public String registrarPersonas(PersonaVo persona) {
		String msg = "";
		msg += "———————————————————————————————————————————————\n";
		msg += "<<DATOS REGISTRADOS>>\n";
		msg += "Documento: "+persona.getDocumento()+"\n";
		msg += "Nombre: "+persona.getNombre()+" \n";
		msg += "Edad: "+persona.getEdad()+"\n";
		msg += "Peso: "+persona.getPeso()+" \n";
		msg += "Talla: "+persona.getTalla()+" \n";
		msg += "IMC: "+persona.getImc()+"\n";
		msg += "Conclusion: "+persona.getConclusion()+"\n";
		msg += "———————————————————————————————————————————————\n\n";
		
		listaPersonas.add(persona);
		return msg;
	}

	public String consultarPromedioPersonas() {
		String msg = "";
		String conclusion = "";
		double suma = 0;
		double promedio = 0;
		
		for (int i = 0; i < listaPersonas.size(); i++) {
			suma += listaPersonas.get(i).getImc();
		}
		
		promedio = suma/listaPersonas.size();
		conclusion = miCoordinador.conclusionImc(promedio);
		
		miPersonaVo = null;
		for (int i = 0; i < listaPersonas.size(); i++) {
			miPersonaVo= listaPersonas.get(i);
			msg += "———————————————————————————————————————————————\n";
			msg += "<<CALCULOS IMC>>\n";
			msg += "Documento: "+miPersonaVo.getDocumento()+"\n";
			msg += "Nombre: "+miPersonaVo.getNombre()+" \n";
			msg += "IMC: "+miPersonaVo.getImc()+"\n";
			msg += "Conclusion: "+miPersonaVo.getConclusion()+"\n";
			msg += "———————————————————————————————————————————————\n\n";
		}
		
		msg += "———————————————————————————————————————————————\n";
		msg += "<<PROMEDIO IMC GENERAL>>\n"; 
		msg += "IMC: "+promedio+"\n";
		msg += "Conclusion: "+conclusion+"\n";
		msg += "———————————————————————————————————————————————\n\n";
		
		return msg;
	}	
}