package models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class DetalleReserva extends Model {
	@Required
	public String fechareserva;
	@Required
	public String estado;
	@ManyToOne
	public Reserva codreserva;
	@ManyToOne
	public Vuelo codvuelo;
}
