package com.mycompany.proyectoing;

import java.util.List;

public class Proveedor {
	
	
    public Proveedor(String nombre, int id, String direccion, int nit, int telefono, String correo) {
    }
    
    //  Atributos
    private String nombre;

	private int id;
    private String direccion;
    private int nit;
    private int telefono;
    private String correo;
    
    
    //  Metodos
    public String getNombre() {
 		return nombre;
 	}
 	public void setNombre(String nombre) {
 		this.nombre = nombre;
 	}
 	public int getId() {
 		return id;
 	}
 	public void setId(int id) {
 		this.id = id;
 	}
 	public String getDireccion() {
 		return direccion;
 	}
 	public void setDireccion(String direccion) {
 		this.direccion = direccion;
 	}
 	public int getNit() {
 		return nit;
 	}
 	public void setNit(int nit) {
 		this.nit = nit;
 	}
 	public int getTelefono() {
 		return telefono;
 	}
 	public void setTelefono(int telefono) {
 		this.telefono = telefono;
 	}
 	public String getCorreo() {
 		return correo;
 	}
 	public void setCorreo(String correo) {
 		this.correo = correo;
 	}

    
    
    
 
    
    private void RecibirPedido() {
    }
    private void CancelarPedido() {
    }
    private void VerCodigoProd() {
    }

}