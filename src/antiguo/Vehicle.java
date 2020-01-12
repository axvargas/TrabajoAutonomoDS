/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiguo;

/**
 *
 * @author Asus
 */
public abstract class Vehicle {
    int maxPotencia;
    int rpm;
    Tanque tanque;
    Color color;
    int velocidades;
    String name;
    String serie;
    short manejo;
    
    public Vehicle(){
    
    }
    public Vehicle(int maxPotencia, int rpm, Tanque tanque, Color color, int velocidades, String name, String serie, short manejo) {
        this.maxPotencia = maxPotencia;
        this.rpm = rpm;
        this.tanque = tanque;
        this.color = color;
        this.velocidades = velocidades;
        this.name = name;
        this.serie = serie;
        this.manejo = manejo;
    }
    public Vehicle(int maxPotencia, int rpm, int velocidades, String name, String serie, int fuel) {
        this.tanque = new Tanque(fuel);
        this.maxPotencia = maxPotencia;
        this.rpm = rpm;
        this.velocidades = velocidades;
        this.name = name;
        this.serie = serie;
    }
    
    public abstract void acelerar();
    
    
    
}
