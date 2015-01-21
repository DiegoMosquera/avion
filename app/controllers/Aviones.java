package controllers;


import models.Avion;
import play.mvc.With;
@CRUD.For(Avion.class)
@With(Secure.class)
public class Aviones extends CRUD {

}

