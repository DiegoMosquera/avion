package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Model;

@Entity
public class Puesto extends Model {
	
	public String puesto;
	@ManyToOne
	public  Categoria codcategoria;

}
