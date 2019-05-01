package com.mycompany.proyectoing;


public class Persona {

	public Persona(String nombre,int id, int telefono, String correo, int cedula,  int edad, String contraseña) {
		this.id = id;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.cedula = cedula;
		this.edad = edad;
		this.contraseña = contraseña;
    }
	
	
	//  ATRIBUTOS  //
	
    private String nombre;
	private int id;
    private int telefono;
    private String correo;
    private int cedula;
    private int edad;
    private String contraseña;
    

    
    // METODOS //
    
    
 
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

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
    public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}


    ///////////////////////////////////////////////////////
	
    void iniciarSesion(String nombre, String contraseña ) {
    	
    	
    }

}