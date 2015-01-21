package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Puesto extends Model {
	@Required
	public String puesto;
	@ManyToOne
	public  Categoria codcategoria;

}
