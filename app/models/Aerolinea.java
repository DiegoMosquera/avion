package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Aerolinea extends Model {
	public String nombre;
	public String ruc;
	public Aerolinea(String nombre, String ruc) {
		super();
		this.nombre = nombre;
		this.ruc = ruc;
	}
	
}

