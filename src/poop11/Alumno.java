/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop11;

/**
 *
 * @author poo01alu19
 */
public class Alumno {
    private String Nombre;
    private String apPaterno;
    private String apMaterno;
    private int numCuenta;
    private int edad;
    private float promedio;

    public Alumno() {
    }
    

    public Alumno(String Nombre, String apPaterno, String apMaterno, int numCuenta, int edad, float promedio) {
        this.Nombre = Nombre;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.numCuenta = numCuenta;
        this.edad = edad;
        this.promedio = promedio;
    }
    /**
     * Método que obtendrá y despues dará el nombre de un alumno
     * @return Nombre 
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * Método que modificará el nombre de un alumno
     * @param Nombre 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * Método que obtendrá y despues dará el apellido paterno de un alumno
     * @return apPaterno
     */
    public String getApPaterno() {
        return apPaterno;
    }
    /** 
     *  Método que modificará el apellido paterno de un alumno
     * @param apPaterno 
     */
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }
    /**
     * Método que obtendrá y despues dará el apellido materno de un alumno
     * @return apMaterno
     */
    public String getApMaterno() {
        return apMaterno;
    }
    /**
     * Método que modificará el apellido materno de un alumno
     * @param apMaterno 
     */
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }
    /**
     * Método que obtendrá y despues dará el apellido materno de un alumno
     * @return NumCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }
    /**
     * Método que modificará el número de cuenta de un alumno
     * @param numCuenta 
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }
    /**
     * Método que obtendrá y despues dará la edad de un alumno
     * @return Edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Método que modificará la edad de un alumno
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Método que obtendrá y despues dará eñ promedio de un alumno
     * @return Promedio
     */
    public float getPromedio() {
        return promedio;
    }
    /**
     * Método que modificará el promedio de un alumno
     * @param promedio 
     */
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}
