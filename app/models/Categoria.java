package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.xml.ws.RequestWrapper;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Categoria extends Model{
	@Required
	public String descripcion;
	@Required
	public String valor;
	@ManyToOne
	public Avion codavion;
}
