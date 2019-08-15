/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Español
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Persona> seleccionFutbol = new ArrayList<Persona>();
        
        
        Entrenador delBosque  = new Entrenador (1,"Vicente", "Del Bosque", 60, "284EZ89");
        
        Futbolista iniesta = new Futbolista (2, "Andres", "Iniesta", 29, 6, "Interior Derecho");

        Masajista  raulMartinez  = new Masajista (3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        seleccionFutbol.add(delBosque);
        
        seleccionFutbol.add(iniesta);
        
        seleccionFutbol.add(raulMartinez);
        
        //Concentra
   
        System.out.println("Todos los integrantes comienzan una concentración");
        
            seleccionFutbol.get(i).Viajar();
        
        i++;
    
        }
        
         int a =0;  
        while (a<seleccionFutbol.size()) {
        
            seleccionFutbol.get(a).entrenamiento();
        
        a++;
    
        }
        
        
        
          }
        // TODO code application logic here
    
      }

