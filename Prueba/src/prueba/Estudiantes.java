/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author ESFOT
 */
public class Estudiantes {
    private String nombre;
    private int edad;
    private String materia;
    
  public Estudiantes (String nombre, int edad, String materia){
      this.nombre = nombre;
      this.edad = edad;
      this.materia = materia;  
  }

   
  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        
        return nombre;
    }

    
  
    
    
    
  
    
}
