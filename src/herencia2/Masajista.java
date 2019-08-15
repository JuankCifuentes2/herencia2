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
public class Masajista extends Persona{
    
    private String Titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String Titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.Titulacion = Titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String Titulacion) {
        this.Titulacion = Titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){
    
    System.out.println( this.getNombre() + "daMasaje" );
        // TODO code application logic here
    }  
    
   
}
