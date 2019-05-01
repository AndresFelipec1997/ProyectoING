package com.mycompany.proyectoing;

import java.sql.Date;

/**
 * 
 */
public class Cajero extends Persona {
	
	// CONSTRUCTOR //

    public Cajero(String nombre, int id, int telefono, String correo, int cedula,  int edad, String contraseña, String sucursal) {
    
    	super(nombre, id, telefono, correo, cedula, edad, contraseña);
    	

    	this.sucursal = sucursal;
    }
    
    
    //  ATRIBUTOS  //

    private String sucursal;
    
    


	public String getSucursal() {
		return sucursal;
	}


	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}


    private void generarFactura(int serial, Date fecha, String nif, String direccion, String descripcion, int iva, int monto, int total) {
    	Factura factura = new Factura(serial, fecha, nif, direccion, descripcion, iva, monto, total);

    }


    private void verInfoCliente() {

    }
    
    private void generarPago() {

    }

}