package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Reserva extends Model{
	@Required
	public String puesto;
	@Required
	public String cantidad;
	@Required
	public String valor;
	@ManyToOne
	public Cliente codcliente;
}
