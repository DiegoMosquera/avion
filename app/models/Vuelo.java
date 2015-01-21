package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Vuelo  extends Model {
	@Required
	public String numerovuelo;
	@Required
	public String fecha;
	@Required
	public String horasalida;
	@Required
	public String horallegada;
	@Required
	public String origen;
	@Required
	public String destino;
	@Required
	public String puertaembarque;
	@ManyToOne
	public Avion codavion;
	public Vuelo(String numerovuelo, String fecha, String horasalida,
			String horallegada, String origen, String destino,
			String puertaembarque, Avion avion) {
		super();
		this.numerovuelo = numerovuelo;
		this.fecha = fecha;
		this.horasalida = horasalida;
		this.horallegada = horallegada;
		this.origen = origen;
		this.destino = destino;
		this.puertaembarque = puertaembarque;
		this.codavion = codavion;
	}
	
	
}
