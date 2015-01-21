package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Cliente extends Model {
	public String cedula;
	public String nombre;
	public String apellido;
	public String ciudad;
	public String direccion;
	public String telefono;
	public String celular;
	public String correo;
	
	public String toString(){
		return cedula+" "+nombre+" "+apellido;
	}
}


