package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Avion extends Model  {
	@Required
	public String descripcion;
	@Required
	public String tipo;
	@Required
	public String placa;
	@Required
	public String serie;
	@ManyToOne
	public Aerolinea codaerolinea; 
	
	public String toString(){
		return placa+" "+serie+" "+tipo;
	}
}
