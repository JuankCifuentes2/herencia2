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
public class Entrenador extends Persona  {
    
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad,String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirPartido(){
    
    System.out.println( this.getNombre() + "Dirige Partido" );
        // TODO code application logic here
    }
    
    @Override
       public void entrenamiento(){
    
    System.out.println( this.getNombre() + " Dirige Entrenamiento" );
        // TODO code application logic here
    }  

    @Override
    public String toString() {
        return "Entrenador{" + "idFederacion=" + idFederacion + '}';
    }
       
       
       
}

