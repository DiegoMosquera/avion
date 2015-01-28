package controllers;

import models.Usuario;

public class Usuarios extends Secure.Security {
	static boolean authenticate(String username, String password){
		Usuario u =Usuario.find("byEmail",username).first();
		flash.put("confirmacion",password);
		return u !=null && u.password.equals(password);
		
	}
	
	
	public static void registrar(){
		render();
	}
	
	
	
	public static void guardar(String nombre, String apellido, String email, String password){
		
		Usuario user =Usuario.find("email=?",email).first();
		System.out.print("user.email");
		if(user==null){
			System.out.print("dentro del if");
		Usuario nuevo=new Usuario();
		nuevo.nombre=nombre;
		nuevo.apellido=apellido;
		nuevo.email=email;
		nuevo.password=password;
		nuevo.save();
		
		Mail m= new Mail(email,"Registro exitoso");
		
		flash.put("confirmacion",nuevo.nombre);
		
		}else {
			flash.put("confirmacion","ya existe usario con ese email");
		}
		
		redirect("/Usuarios/registrar");
	}
	

	
	
}
