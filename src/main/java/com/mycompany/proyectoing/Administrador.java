package com.mycompany.proyectoing;

public class Administrador extends Persona {

  //  private static final String String = null;

	
	public Administrador(String nombre, int id, int telefono, String correo, int cedula,  int edad,String contraseña, String tienda) {
    	
    	super(nombre, id, telefono, correo, cedula, edad, contraseña);
    	this.setTienda(tienda);
    }

    
    // ATRIBUTOS //
    
    private String tienda;

    
    // METODOS //
    
	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}
    
    //  CRUD CAJERO 

    public void crearCajero(String nombre, int id, int telefono, String correo, int cedula,  int edad, String contraseña, String sucursal) {
    	
    	Cajero cajero = new Cajero(nombre, id, telefono, correo, cedula, edad, contraseña, sucursal);
    }
    
    private void verCajero() {
    	
    }
    
    private void actualizarCajero() {
    }
    
    private void eliminarCajero() {
    }
    
    
    
    
    //CRUD proveedores
    private void gestionarProveedor() {
    
    }


    private void generarInventario() {
    }

    private void gestionarPedido() {
    }


    private void hacerReportes() {
    }


    private void cancelarCompra() {
    }



}