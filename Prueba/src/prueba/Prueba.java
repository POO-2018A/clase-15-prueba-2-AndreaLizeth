/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import java.util.*;
/**
 *
 * @author ESFOT
 */
public class Prueba {
   
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // TODO code application logic here
        Estudiantes [] estudiantes = new Estudiantes[5];
        Materia [] materia = new Materia [2];
        Estudiantes[] objEstudiantes = new Estudiantes[estudiantes.length];
        
        System.out.println("\tBIENVENIDO!");
        System.out.println("Ingrese la información del Estudiante:");
        

        for (int i = 0; i< estudiantes.length ; i++){
          
            System.out.println("Nombre del Estudiante" + (i+1) + ":");
           
            String nombre = scan.nextLine();
          
            System.out.println("Edad:");
            int edad = scan.nextInt();
            scan.nextLine();
           
            for(int j = 0; j< materia.length; j++){
                System.out.println("Ingrese materia"+(j+1)+": ");
                String materias = scan.nextLine();
              }
            
            
                System.out.println("Se ha ingresado estudiante con los siguientes datos:"+ (objEstudiantes[i]));
                
           
      
      
    }
     
           
        

  
    }
}
        
  
