package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Reserva extends Model{
	public String puesto;
	public String cantidad;
	public String valor;
	@ManyToOne
	public Cliente codcliente;
}
