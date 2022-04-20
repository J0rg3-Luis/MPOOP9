/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad;

/**
 * Clase que construye un SerVivo
 * @author alumno
 */

public abstract class SerVivo {
    private String nombre;
    private int edad;

    /**
     * Constructor vacío
     */
    
    public SerVivo() {
    }
    
    /**
     * Constructor que recibe nombre y edad
     * @param nombre El nombre del ser vivo
     * @param edad La edad del ser vivo
     */
    
    public SerVivo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
    
    /**
     * Método que indica que está respirando el ser vivo
     */
    
    public abstract void respirar();
    
    /**
     * Método que imprime el nombre y edad de un ser vivo
     * @return El nombre y edad de un ser vivo
     */
    
    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
