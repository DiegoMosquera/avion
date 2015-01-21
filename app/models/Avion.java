package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Avion extends Model  {
	public String descripcion;
	public String tipo;
	public String placa;
	public String serie;
	@ManyToOne
	public Aerolinea codaerolinea; 
}
