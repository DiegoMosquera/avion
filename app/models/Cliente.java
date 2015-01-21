package models;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Cliente extends Model {
	@Required
	public String cedula;
	@Required
	public String nombre;
	@Required
	public String apellido;
	@Required
	public String ciudad;
	@Required
	public String direccion;
	@Required
	public String telefono;
	@Required
	public String celular;
	@Required
	public String correo;
	
	public String toString(){
		return cedula+" "+nombre+" "+apellido;
	}
}


