package models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class DetalleReserva extends Model {
	public String fechareserva;
	public String estado;
	@ManyToOne
	public Reserva codreserva;
	@ManyToOne
	public Vuelo codvuelo;
}
