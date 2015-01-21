package controllers;

import java.util.List;

import models.Avion;
import models.Vuelo;
import play.mvc.Controller;

public class Vuelos extends Controller {
	
	public static void index(){
		//aviones cargo todos los registro dela bdd
		List<Avion> aviones=Avion.findAll();
		render(aviones);
	}
	
	public static void guardar(String numerovuelo, String fecha, String horasalida, String horallegada, String origen, String destino, String puertaembarque, Long idAvion){
		if(!(idAvion.equals(null))){
		Avion avion=Avion.findById(idAvion);
		Vuelo nuevo= new Vuelo(numerovuelo,fecha,horasalida,horallegada,origen,destino,puertaembarque,avion);
		nuevo.save();
		flash.put("confirmacion","Se ha guardado exitosamente el vuelo");
		redirect("/vuelos");
		}else{
		flash.put("error","No se pudo guardado");
		redirect("/vuelos");
		}
	}

}
