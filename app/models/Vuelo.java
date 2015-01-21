package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Vuelo  extends Model {
	public String numerovuelo;
	public String fecha;
	public String horasalida;
	public String horallegada;
	public String origen;
	public String destino;
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
