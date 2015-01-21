package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import controllers.Secure.Security;

import models.*;

public class Application extends Controller {
	
	@Before
    public static void mostrarUsuario(){
    	Usuario user =  Usuario.find("byEmail",Security.connected()).first();
    	if (Security.isConnected()){
    		renderArgs.put("conectado",user.nombre+" "+user.apellido);
    	}
    }
	
	
	public static void index() {
    	String saludo="hola mundo";
        render(saludo);
    }

}