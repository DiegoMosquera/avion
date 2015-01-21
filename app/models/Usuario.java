package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
@Entity
public class Usuario extends Model {
 	
	public String nombre;
	public String apellido;
		
	public String email;
	public String password;
	
	
}
 