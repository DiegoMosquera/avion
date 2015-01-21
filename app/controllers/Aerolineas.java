package controllers;

import models.Usuario;
import controllers.Secure.Security;
import play.mvc.Before;
import play.mvc.With;

@With(Secure.class)
public class Aerolineas extends CRUD{
	
	@Before
    public static void mostrarUsuario(){
    	Usuario user =  Usuario.find("byEmail",Security.connected()).first();
    	if (Security.isConnected()){
    		renderArgs.put("conectado",user.nombre+" "+user.apellido);
    	}
    }
	/*
	public static void index(){
		render();
	}
	
	public static void guardar (String nombre, String ruc){
		Aerolinea nuevo=new Aerolinea(nombre,ruc);
		nuevo.save();
		redirect("/aerolineas");
	}
	*/

}
