package controllers;

import models.Aerolinea;
import play.mvc.Controller;

public class Aerolineas extends Controller {
	
	public static void index(){
		render();
	}
	
	public static void guardar (String nombre, String ruc){
		Aerolinea nuevo=new Aerolinea(nombre,ruc);
		nuevo.save();
		redirect("/aerolineas");
	}

}
