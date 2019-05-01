package com.mycompany.proyectoing;

import java.util.*;

public class Gerente extends Persona {

    public Gerente( String nombre, int id, int telefono, String correo, int cedula,  int edad, String sucursal, String contraseña, List<Tienda> Tienda ) {
    	super(nombre, id, telefono, correo, cedula, edad, contraseña); 
    	
    	this.Tienda = Tienda;
    }

    
    
    
    //  ATRIBUTOS //
    
    private List Tienda;
    
    
    
    
    //  METODOS  ///
    
    public List getTienda() {
		return Tienda;
	}

	public void setTienda(List tienda) {
		Tienda = tienda;
	}

	private void gestionarAdministrador() {
    }

    private void verReporte() {
    }
    
    private void verEstadistica() {
    }

}