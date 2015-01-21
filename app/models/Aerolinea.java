package models;


import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity

public class Aerolinea extends Model {
	@Required
	public String nombre;
	@Required
	public String ruc;
	public Aerolinea(String nombre, String ruc) {
		super();
		this.nombre = nombre;
		this.ruc = ruc;
	}

	public String toString(){
		return nombre;
	}
}

