/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

/**
 *
 * @author Español
 */
public class Persona {
    
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  public void Concentrarse(){
    
    System.out.println(this.apellido+ " " + this.nombre + " Viajar");
        // TODO code application logic here
    }  
   public void Viajar(){
    
    System.out.println(this.apellido+ " " + this.nombre +  " Viajar");
        // TODO code application logic here
    }
  
     public void entrenamiento(){
    
    } 
   
   
}

