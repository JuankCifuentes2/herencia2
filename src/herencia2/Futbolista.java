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
public class Futbolista extends Persona {
    
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad,int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
         public void jugarPartido(){
    
    System.out.println( this.getNombre() + "Juega partido" );
        // TODO code application logic here
    }
    
    @Override
       public void entrenamiento(){
    
    System.out.println( this.getNombre() + " entrena" );
        // TODO code application logic here
    }  
         
         
}
